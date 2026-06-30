package ir;

/* loaded from: classes12.dex */
public final class g extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f375369b;

    /* renamed from: c, reason: collision with root package name */
    public final int f375370c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f375371d;

    /* renamed from: e, reason: collision with root package name */
    public final int f375372e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb r4, int r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            java.lang.String r0 = "emojiInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "sosDocId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            qk.x6 r0 = r4.m1()
            r1 = -1
            if (r0 != 0) goto L14
            r0 = r1
            goto L1c
        L14:
            int[] r2 = ir.w0.f375444a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L1c:
            if (r0 == r1) goto L23
            r1 = 1
            if (r0 == r1) goto L23
            r0 = 6
            goto L24
        L23:
            r0 = 0
        L24:
            r3.<init>(r0)
            r3.f375369b = r4
            r3.f375370c = r5
            r3.f375371d = r6
            r3.f375372e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.g.<init>(com.tencent.mm.api.IEmojiInfo, int, java.lang.String, int):void");
    }

    @Override // ir.u0
    public boolean a(java.lang.Object obj) {
        if (mo139714xb2c87fbf(obj) && (obj instanceof ir.g)) {
            ir.g gVar = (ir.g) obj;
            qk.x6 m17 = gVar.f375369b.m1();
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f375369b;
            if (m17 == interfaceC4987x84e327cb.m1() && gVar.f375369b.mo42932x7498cf1c() == interfaceC4987x84e327cb.mo42932x7498cf1c() && gVar.f375369b.s1() == interfaceC4987x84e327cb.s1() && gVar.f375370c == this.f375370c && gVar.f375369b.V() == interfaceC4987x84e327cb.V()) {
                return true;
            }
        }
        return false;
    }

    @Override // ir.u0
    /* renamed from: equals */
    public boolean mo139714xb2c87fbf(java.lang.Object obj) {
        if (super.mo139714xb2c87fbf(obj) && (obj instanceof ir.g)) {
            ir.g gVar = (ir.g) obj;
            java.lang.String mo42933xb5885648 = gVar.f375369b.mo42933xb5885648();
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f375369b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo42933xb5885648, interfaceC4987x84e327cb.mo42933xb5885648()) || (interfaceC4987x84e327cb.b1() != 0 && gVar.f375369b.b1() == interfaceC4987x84e327cb.b1())) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ g(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, int i17, java.lang.String str, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(interfaceC4987x84e327cb, i17, (i19 & 4) != 0 ? "" : str, (i19 & 8) != 0 ? 0 : i18);
    }
}
