package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class n1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements wt2.a {

    /* renamed from: d, reason: collision with root package name */
    public final al2.f f198797d;

    /* renamed from: e, reason: collision with root package name */
    public el2.i0 f198798e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f198799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        al2.f fVar = new al2.f(activity);
        fVar.f87371e = this;
        this.f198797d = fVar;
    }

    @Override // wt2.a
    public void B4(r45.a52 info, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f198797d.b(info, lVar);
    }

    @Override // wt2.a
    public void J3(android.content.Context context, r45.z42 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f198797d.d(context, item);
    }

    @Override // wt2.a
    public void O1(r45.z42 info, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f198797d.c(info, lVar);
    }

    public final void O6(android.content.Intent intent) {
        if ((intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0) == 5) {
            P6(null);
            android.content.Intent intent2 = m80379x76847179().getIntent();
            if (intent2 != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[EDGE_INSN: B:39:0x00ae->B:40:0x00ae BREAK  A[LOOP:0: B:26:0x0065->B:43:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:0: B:26:0x0065->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P6(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L14
            java.lang.String r1 = "KEY_FINDER_NOTICE_ITEM"
            byte[] r1 = r14.getByteArray(r1)
            if (r1 == 0) goto L14
            r45.a52 r2 = new r45.a52
            r2.<init>()
            r2.mo11468x92b714fd(r1)
            goto L15
        L14:
            r2 = r0
        L15:
            if (r14 == 0) goto L1e
            java.lang.String r1 = "KEY_FINDER_NOTICE_DELED_ID"
            java.lang.String r14 = r14.getString(r1)
            goto L1f
        L1e:
            r14 = r0
        L1f:
            jz5.f0 r1 = jz5.f0.f384359a
            al2.f r3 = r13.f198797d
            r4 = 2
            if (r2 == 0) goto L40
            wt2.a.m4(r13, r2, r0, r4, r0)
            r3.getClass()
            gk2.e r6 = r13.q5()
            if (r6 == 0) goto L40
            bf2.c r5 = bf2.c.f101131a
            r7 = 3
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 24
            r12 = 0
            bf2.c.b(r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r1
            goto L41
        L40:
            r2 = r0
        L41:
            if (r2 != 0) goto Lc8
            if (r14 == 0) goto Lbe
            int r2 = r14.length()
            r5 = 0
            r6 = 1
            if (r2 <= 0) goto L4f
            r2 = r6
            goto L50
        L4f:
            r2 = r5
        L50:
            if (r2 == 0) goto L53
            goto L54
        L53:
            r14 = r0
        L54:
            if (r14 == 0) goto Lbe
            el2.i0 r2 = r13.f198798e
            if (r2 == 0) goto Lb7
            r2.j0(r14)
            java.util.LinkedList r2 = r3.f87370d
            if (r2 == 0) goto Lbe
            java.util.Iterator r2 = r2.iterator()
        L65:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Lad
            java.lang.Object r7 = r2.next()
            r8 = r7
            r45.z42 r8 = (r45.z42) r8
            int r9 = r8.m75939xb282bd08(r6)
            if (r9 != r6) goto La9
            r45.h32 r9 = new r45.h32
            r9.<init>()
            com.tencent.mm.protobuf.g r8 = r8.m75934xbce7f2f(r4)
            if (r8 == 0) goto L88
            byte[] r8 = r8.g()
            goto L89
        L88:
            r8 = r0
        L89:
            if (r8 != 0) goto L8c
            goto L9c
        L8c:
            r9.mo11468x92b714fd(r8)     // Catch: java.lang.Exception -> L90
            goto L9c
        L90:
            r8 = move-exception
            java.lang.String r10 = ""
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r11 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r11, r10, r8)
        L9c:
            r8 = 4
            java.lang.String r8 = r9.m75945x2fec8307(r8)
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r14)
            if (r8 == 0) goto La9
            r8 = r6
            goto Laa
        La9:
            r8 = r5
        Laa:
            if (r8 == 0) goto L65
            goto Lae
        Lad:
            r7 = r0
        Lae:
            r45.z42 r7 = (r45.z42) r7
            if (r7 == 0) goto Lbe
            wt2.a.x4(r13, r7, r0, r4, r0)
            r0 = r1
            goto Lbe
        Lb7:
            java.lang.String r14 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r14)
            throw r0
        Lbe:
            if (r0 != 0) goto Lc8
            com.tencent.mm.plugin.finder.live.viewmodel.m1 r14 = new com.tencent.mm.plugin.finder.live.viewmodel.m1
            r14.<init>(r13)
            r3.e(r14)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n1.P6(android.os.Bundle):void");
    }

    @Override // wt2.a
    public void V3() {
        al2.h.a(this.f198797d, null, 1, null);
    }

    @Override // wt2.a
    public java.util.LinkedList j0() {
        return this.f198797d.f87370d;
    }

    @Override // wt2.a
    public void m1() {
        el2.i0 i0Var = this.f198798e;
        if (i0Var != null) {
            el2.i0.n0(i0Var, false, 1, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("view");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 != 1012) {
            if (i17 == 1013 && i18 == 1000) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY") : null;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("KEY_FINDER_NOTICE_DELED_ID", stringExtra);
                P6(bundle);
                return;
            }
            return;
        }
        if (i18 == -1) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO") : null;
            r45.a52 a52Var = new r45.a52();
            a52Var.set(0, 1);
            a52Var.set(1, 1);
            a52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(byteArrayExtra));
            bundle2.putByteArray("KEY_FINDER_NOTICE_ITEM", a52Var.mo14344x5f01b1f6());
            P6(bundle2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.em7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f198799f = findViewById;
        android.content.Context context = findViewById.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        el2.i0 i0Var = new el2.i0(context);
        i0Var.o0(this, this.f198797d.f87369c, m158354x19263085());
        this.f198798e = i0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        super.mo2280xc944513d(intent);
        O6(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        O6(m80379x76847179().getIntent());
    }

    @Override // wt2.a
    public gk2.e q5() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u.class)).f198963e;
    }
}
