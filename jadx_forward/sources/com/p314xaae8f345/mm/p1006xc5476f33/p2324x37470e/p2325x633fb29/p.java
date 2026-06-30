package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class p implements com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o f257235f = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f257236a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.i70 f257237b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.g70 f257238c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f257239d;

    /* renamed from: e, reason: collision with root package name */
    public r45.tz6 f257240e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        this.f257236a = composition;
        this.f257237b = new r45.i70();
        this.f257238c = new r45.g70();
        this.f257239d = new java.util.LinkedList();
    }

    public final void b(android.graphics.Rect drawingRect, float[] validRect, java.util.List editItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawingRect, "drawingRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validRect, "validRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editItems, "editItems");
        r45.vl5 vl5Var = new r45.vl5();
        r45.g70 g70Var = this.f257238c;
        g70Var.f456471d = vl5Var;
        r45.vl5 drawingRect2 = g70Var.f456471d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawingRect2, "drawingRect");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.g(drawingRect, drawingRect2);
        g70Var.f456474g = new r45.vl5();
        android.graphics.Rect rect = new android.graphics.Rect((int) validRect[0], (int) validRect[1], (int) validRect[2], (int) validRect[3]);
        r45.vl5 validRect2 = g70Var.f456474g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(validRect2, "validRect");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.g(rect, validRect2);
        java.util.LinkedList linkedList = g70Var.f456472e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(editItems, 10));
        java.util.Iterator it = editItems.iterator();
        while (it.hasNext()) {
            zu3.a aVar = (zu3.a) it.next();
            r45.de deVar = new r45.de();
            deVar.f453871d = aVar.f557291a.f557338d;
            deVar.f453872e = x51.j1.a(aVar.mo179488xc3d7db06().mo14344x5f01b1f6());
            arrayList.add(deVar);
        }
        linkedList.addAll(arrayList);
    }

    public final void c(java.util.List magicList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(magicList, "magicList");
        java.util.Iterator it = magicList.iterator();
        while (it.hasNext()) {
            ro4.b bVar = (ro4.b) it.next();
            java.util.LinkedList linkedList = this.f257239d;
            r45.ci4 ci4Var = new r45.ci4();
            ci4Var.f453107d = bVar.f479651b.f479649a;
            ci4Var.f453108e = bVar.f479653d;
            ci4Var.f453109f = bVar.f479654e;
            linkedList.add(ci4Var);
        }
    }

    public final void d(so4.b template) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(template, "template");
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.f257313a;
        r45.tz6 tz6Var = new r45.tz6();
        template.getClass();
        tz6Var.f468423d = null;
        java.lang.String str = lp0.b.e() + java.lang.System.currentTimeMillis() + ".mp3";
        template.getClass();
        com.p314xaae8f345.mm.vfs.w6.c(null, str);
        tz6Var.f468424e = str;
        template.getClass();
        tz6Var.f468425f = 0L;
        template.getClass();
        tz6Var.f468426g = false;
        this.f257240e = tz6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[LOOP:3: B:107:0x028a->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.i70 e(java.lang.String r21, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r22, android.util.Size r23, android.graphics.Rect r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p.e(java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara, android.util.Size, android.graphics.Rect, boolean, boolean):r45.i70");
    }

    public r45.h70 f() {
        r45.h70 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.a(this.f257236a, this.f257237b);
        a17.f457437n = this.f257238c;
        a17.f457438o.addAll(this.f257239d);
        r45.tz6 tz6Var = this.f257240e;
        a17.f457439p = tz6Var;
        if (tz6Var != null) {
            a17.f457433g = false;
        }
        return a17;
    }
}
