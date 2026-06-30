package hn4;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f364106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f364107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn4.j f364108f;

    public i(hn4.j jVar, java.util.List list, boolean z17) {
        this.f364108f = jVar;
        this.f364106d = list;
        this.f364107e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.z0 z0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) ((hn4.b) this.f364108f.f346025g)).K;
        synchronized (z0Var) {
            java.util.LinkedList linkedList = (java.util.LinkedList) z0Var.b();
            boolean z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f364106d.size()));
            if (this.f364107e) {
                int size = linkedList.size();
                if (linkedList.size() > 0) {
                    if (((r45.xn6) linkedList.get(0)).f471792h.equals(((r45.xn6) this.f364106d.get(0)).f471792h)) {
                        linkedList.clear();
                    } else {
                        this.f364106d.remove(0);
                        z17 = false;
                    }
                    linkedList.addAll(this.f364106d);
                    if (z17) {
                        r45.xn6 xn6Var = (r45.xn6) this.f364106d.get(0);
                        linkedList.set(0, xn6Var);
                        fn4.m E = this.f364108f.E(xn6Var);
                        if (E != null) {
                            E.q(xn6Var);
                        }
                    }
                    hn4.j jVar = this.f364108f;
                    if (jVar.f364112m) {
                        jVar.m8146xced61ae5();
                    } else {
                        if (jVar.f364113n != null && linkedList.get(0) != null) {
                            r45.xn6 xn6Var2 = (r45.xn6) linkedList.get(0);
                            this.f364108f.f364113n.q(xn6Var2);
                            ((java.util.HashMap) this.f364108f.f346024f).put(xn6Var2.f471792h, new java.lang.ref.WeakReference(this.f364108f.f364113n));
                            this.f364108f.f364113n = null;
                            if ((xn6Var2.L & 128) > 0 && gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_VIDEO_EDUCATION_INT, 0) <= 0) {
                                this.f364108f.f346025g.mo72292x4905e9fa().postDelayed(new hn4.h(this), 1000L);
                            }
                        }
                        hn4.j jVar2 = this.f364108f;
                        jVar2.m8153xd399a4d9(jVar2.z() + size, this.f364106d.size() - size);
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) ((hn4.b) this.f364108f.f346025g)).H.e((r45.xn6) linkedList.get(0));
                } else {
                    linkedList.addAll(this.f364106d);
                    hn4.j jVar3 = this.f364108f;
                    jVar3.m8153xd399a4d9(jVar3.z(), this.f364106d.size());
                }
            } else {
                int size2 = linkedList.size();
                linkedList.addAll(this.f364106d);
                hn4.j jVar4 = this.f364108f;
                jVar4.m8153xd399a4d9(size2 + jVar4.z(), this.f364106d.size());
            }
        }
    }
}
