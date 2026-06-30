package com.p314xaae8f345.mm.ui.p2741x4c58d2b0;

/* renamed from: com.tencent.mm.ui.transmit.MMCreateChatroomUI */
/* loaded from: classes11.dex */
public class ActivityC22566x6f3df1e3 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f292483J = 0;
    public java.util.List C;
    public boolean D;
    public int E;
    public dk5.s0 F;
    public dk5.u0 G;
    public boolean H;
    public boolean I;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            dk5.s0 s0Var = this.F;
            s0Var.f316401q.remove(str);
            java.util.Iterator it = ((java.util.ArrayList) s0Var.f316400p).iterator();
            while (it.hasNext()) {
                dk5.r0 r0Var = (dk5.r0) it.next();
                if (str.equals(r0Var.f316377g)) {
                    r0Var.f316377g = null;
                }
            }
            s0Var.notifyDataSetChanged();
            x7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        if (this.F == null) {
            this.F = new dk5.s0(this, null, true, true, this.C, this.A);
        }
        return this.F;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        if (this.G == null) {
            this.G = new dk5.u0(this, this.A);
        }
        return this.G;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return getString(com.p314xaae8f345.mm.R.C30867xcad56011.iga);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        dk5.s0 s0Var = this.F;
        dk5.u0 u0Var = this.G;
        p13.v vVar = u0Var.f316458q;
        java.lang.String str = u0Var.f316457p;
        s0Var.getClass();
        if (vVar.f432693e.size() != 1 || !((p13.y) vVar.f432693e.get(0)).f432720e.equals("no_result\u200b")) {
            dk5.r0 r0Var = new dk5.r0(s0Var, null);
            r0Var.f316376f = vVar.f432693e;
            r0Var.f316372b = vVar.f432692d;
            r0Var.f316371a = str;
            ((java.util.ArrayList) s0Var.f316400p).add(r0Var);
            com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = s0Var.f288609d;
            int headerViewsCount = i17 - l4Var.O3().getHeaderViewsCount();
            if (headerViewsCount >= 3) {
                vVar.f432693e.add(0, (p13.y) vVar.f432693e.remove(headerViewsCount));
                i17 = l4Var.O3().getHeaderViewsCount();
            }
            s0Var.v();
            l4Var.O3().post(new dk5.q0(s0Var, r0Var.f316373c + i17 + 1));
        }
        Y6();
        X6();
        mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        dk5.s0 s0Var = this.F;
        for (java.lang.String str : s0Var.f316398n) {
            p13.u uVar = new p13.u();
            uVar.f432685n = s0Var.f316402r;
            uVar.f432684m = s0Var.f316403s;
            uVar.f432674c = str;
            uVar.f432683l = r13.b.f450135d;
            uVar.f432678g = new int[]{131072};
            uVar.f432681j.add("filehelper");
            uVar.f432681j.add(c01.z1.r());
            uVar.f432681j.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c());
            p13.c sj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            s0Var.f316399o = arrayList;
            arrayList.add(sj6);
        }
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new dk5.v0(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        x7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.C = getIntent().getStringArrayListExtra("query_phrase_list");
        this.D = getIntent().getBooleanExtra("go_to_chatroom_direct", false);
        this.E = getIntent().getIntExtra("scene_from", 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean k7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.F.k();
        if (!this.H && this.E == 3) {
            java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.f219908a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13970, 0);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        dk5.r0 r0Var;
        if (!(dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return false;
        }
        dk5.s0 s0Var = this.F;
        java.lang.String str = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar).C.f432720e;
        int i17 = dVar.f288366b;
        if (!s0Var.f316401q.contains(str)) {
            return false;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) s0Var.f316400p;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                r0Var = null;
                break;
            }
            r0Var = (dk5.r0) arrayList.get(size);
            if (i17 >= r0Var.f316373c) {
                break;
            }
        }
        return (r0Var == null || str.equals(r0Var.f316377g)) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        if (!(dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return false;
        }
        dk5.s0 s0Var = this.F;
        return s0Var.f316401q.contains(((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar).C.f432720e);
    }

    public final void w7(com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a aVar) {
        aVar.f273781d = new dk5.w0(this, aVar);
        aVar.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573921gb2), true, true, new dk5.x0(this, aVar));
    }

    public void x7() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.F.t();
        if (arrayList.size() <= 0) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            m78500x43e00957(1, false);
            return;
        }
        mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1) + "(" + arrayList.size() + ")");
        if (arrayList.size() > 1) {
            m78500x43e00957(1, true);
        } else {
            m78500x43e00957(1, false);
        }
    }

    public final java.util.List y7(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!gm0.j1.a() || list == null) {
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
            }
            linkedList.add(str);
        }
        return linkedList;
    }
}
