package tr2;

/* loaded from: classes5.dex */
public final class f implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tr2.l f502914a;

    public f(tr2.l lVar) {
        this.f502914a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void a(boolean z17, int i17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0024 A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:44:0x000d, B:5:0x0017, B:25:0x0024, B:28:0x002c, B:30:0x0036, B:31:0x0045, B:34:0x0052, B:37:0x005d), top: B:43:0x000d }] */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb r17) {
        /*
            r16 = this;
            r1 = r17
            r2 = 1
            java.lang.String r3 = "onSendCustomEmoji: "
            java.lang.String r4 = "InteractionEasterEggAddHalfScreen"
            r0 = 0
            r5 = 0
            r7 = 0
            if (r1 == 0) goto L14
            java.lang.String r8 = r17.N0()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L60
        L14:
            r8 = r0
        L15:
            if (r8 == 0) goto L20
            boolean r9 = r26.n0.N(r8)     // Catch: java.lang.Throwable -> L12
            if (r9 == 0) goto L1e
            goto L20
        L1e:
            r9 = r7
            goto L21
        L20:
            r9 = r2
        L21:
            if (r9 == 0) goto L24
            goto L6f
        L24:
            com.tencent.mm.vfs.z7 r8 = com.p314xaae8f345.mm.vfs.z7.a(r8)     // Catch: java.lang.Throwable -> L12
            java.lang.String r9 = r8.f294812f
            if (r9 == 0) goto L45
            java.lang.String r13 = com.p314xaae8f345.mm.vfs.e8.l(r9, r7, r7)     // Catch: java.lang.Throwable -> L12
            boolean r9 = r9.equals(r13)     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto L45
            com.tencent.mm.vfs.z7 r9 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> L12
            java.lang.String r11 = r8.f294810d     // Catch: java.lang.Throwable -> L12
            java.lang.String r12 = r8.f294811e     // Catch: java.lang.Throwable -> L12
            java.lang.String r14 = r8.f294813g     // Catch: java.lang.Throwable -> L12
            java.lang.String r15 = r8.f294814h     // Catch: java.lang.Throwable -> L12
            r10 = r9
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L12
            r8 = r9
        L45:
            com.tencent.mm.vfs.b3 r9 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> L12
            com.tencent.mm.vfs.z2 r0 = r9.m(r8, r0)     // Catch: java.lang.Throwable -> L12
            boolean r8 = r0.a()     // Catch: java.lang.Throwable -> L12
            if (r8 != 0) goto L52
            goto L6f
        L52:
            com.tencent.mm.vfs.q2 r8 = r0.f294799a     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.f294800b     // Catch: java.lang.Throwable -> L12
            com.tencent.mm.vfs.x1 r0 = r8.m(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L5d
            goto L6f
        L5d:
            long r8 = r0.f294766c     // Catch: java.lang.Throwable -> L12
            goto L70
        L60:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r3)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r0)
        L6f:
            r8 = r5
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L8d
            r3 = 2097152(0x200000, double:1.036131E-317)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L8d
            r3 = r16
            goto L90
        L8d:
            r3 = r16
            r2 = r7
        L90:
            tr2.l r0 = r3.f502914a
            if (r2 == 0) goto L98
            r0.a(r1, r7)
            goto Lae
        L98:
            android.view.View r0 = r0.f502923b
            android.content.Context r0 = r0.getContext()
            int r1 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n
            com.tencent.mm.ui.widget.dialog.e4 r1 = new com.tencent.mm.ui.widget.dialog.e4
            r1.<init>(r0)
            r0 = 2131777225(0x7f1056c9, float:1.9185945E38)
            r1.d(r0)
            r1.c()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tr2.f.b(com.tencent.mm.api.IEmojiInfo):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void c() {
    }
}
