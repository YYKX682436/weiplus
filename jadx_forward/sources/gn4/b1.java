package gn4;

/* loaded from: classes15.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f355123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gn4.c1 f355125f;

    public b1(gn4.c1 c1Var, java.util.List list, boolean z17) {
        this.f355125f = c1Var;
        this.f355123d = list;
        this.f355124e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.z0 s47 = this.f355125f.f355134h.s4();
        synchronized (s47) {
            java.util.LinkedList linkedList = (java.util.LinkedList) s47.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryOnlyFSVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f355123d.size()));
            if (this.f355124e) {
                int size = linkedList.size();
                if (linkedList.size() > 0) {
                    linkedList.clear();
                    linkedList.addAll(this.f355123d);
                    gn4.c1 c1Var = this.f355125f;
                    if (c1Var.f355136m) {
                        c1Var.m8146xced61ae5();
                    } else {
                        if (c1Var.f355137n != null && linkedList.get(0) != null) {
                            r45.xn6 xn6Var = (r45.xn6) linkedList.get(0);
                            this.f355125f.f355137n.q(xn6Var);
                            ((java.util.HashMap) this.f355125f.f346024f).put(xn6Var.f471792h, new java.lang.ref.WeakReference(this.f355125f.f355137n));
                            this.f355125f.f355137n = null;
                            if ((xn6Var.L & 128) > 0 && gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_VIDEO_EDUCATION_INT, 0) <= 0) {
                                this.f355125f.f346025g.mo72292x4905e9fa().postDelayed(new gn4.a1(this), 1000L);
                            }
                        }
                        gn4.c1 c1Var2 = this.f355125f;
                        c1Var2.m8153xd399a4d9(c1Var2.z() + size, this.f355123d.size() - size);
                    }
                    this.f355125f.f355134h.o4().e((r45.xn6) this.f355123d.get(0));
                } else {
                    linkedList.addAll(this.f355123d);
                    gn4.c1 c1Var3 = this.f355125f;
                    c1Var3.m8153xd399a4d9(c1Var3.z(), this.f355123d.size());
                }
            } else {
                int size2 = linkedList.size();
                linkedList.addAll(this.f355123d);
                gn4.c1 c1Var4 = this.f355125f;
                c1Var4.m8147xed6e4d18(c1Var4.z() + size2);
                gn4.c1 c1Var5 = this.f355125f;
                c1Var5.m8153xd399a4d9(size2 + c1Var5.z(), this.f355123d.size());
            }
        }
    }
}
