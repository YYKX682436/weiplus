package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f94310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f94311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zb5 f94313g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(yz5.q qVar, java.lang.ref.WeakReference weakReference, java.lang.String str, r45.zb5 zb5Var) {
        super(2);
        this.f94310d = qVar;
        this.f94311e = weakReference;
        this.f94312f = str;
        this.f94313g = zb5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.y0 result = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.y0) obj;
        r45.cf response = (r45.cf) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(response, "response");
        boolean z18 = result.f94478a;
        java.lang.ref.WeakReference weakReference = this.f94311e;
        yz5.q qVar = this.f94310d;
        boolean z19 = result.f94481d;
        if (z18) {
            java.util.LinkedList linkedList = response.f371515d;
            java.lang.Boolean bool = null;
            if (linkedList != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    z17 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    r45.i9 i9Var = (r45.i9) next;
                    java.lang.String str = i9Var != null ? i9Var.f376822d : null;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        arrayList.add(next);
                    }
                }
                r45.i9 i9Var2 = arrayList.isEmpty() ^ true ? (r45.i9) arrayList.get(0) : null;
                if (i9Var2 != null) {
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.PreloadLogic", "[findAppMsgContext] url:%s", this.f94312f);
                    if (!z19) {
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.v0 v0Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94443i;
                        java.lang.String Url = i9Var2.f376822d;
                        kotlin.jvm.internal.o.f(Url, "Url");
                        v0Var.c(Url, i9Var2);
                        ax4.c cVar = new ax4.c();
                        cVar.f15118d = result.f94479b;
                        cVar.f15119e = result.f94480c;
                        cVar.f15115a = 1;
                        if (i9Var2.f376827i) {
                            cVar.f15117c++;
                            ax4.a.a(31);
                        } else {
                            cVar.f15116b++;
                            ax4.a.a(32);
                        }
                        cVar.f15120f += i9Var2.computeSize();
                        cVar.a();
                    }
                    int i17 = i9Var2.f376833r;
                    java.util.LinkedList linkedList2 = i9Var2.f376836u;
                    r45.zb5 zb5Var = this.f94313g;
                    if (i17 == 8) {
                        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
                        int i18 = zb5Var.f391886h;
                        if (linkedList2 != null && !linkedList2.isEmpty()) {
                            z17 = false;
                        }
                        ((yq1.z) a0Var).z(i18, !z17 ? 20 : 21, 0, 0);
                    }
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2.f94203a.c(linkedList2, zb5Var.f391886h);
                    qVar.invoke(weakReference, result, i9Var2);
                    bool = java.lang.Boolean.TRUE;
                }
            }
            if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                result.f94478a = false;
                qVar.invoke(weakReference, result, new r45.i9());
            }
        } else {
            qVar.invoke(weakReference, result, new r45.i9());
        }
        if (!z19) {
            ax4.a.a(20);
            ax4.a.a(26);
            ax4.a.a(result.f94478a ? 24 : 25);
        }
        return jz5.f0.f302826a;
    }
}
