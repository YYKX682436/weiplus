package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f175843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f175844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zb5 f175846g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(yz5.q qVar, java.lang.ref.WeakReference weakReference, java.lang.String str, r45.zb5 zb5Var) {
        super(2);
        this.f175843d = qVar;
        this.f175844e = weakReference;
        this.f175845f = str;
        this.f175846g = zb5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y0 result = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y0) obj;
        r45.cf response = (r45.cf) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        boolean z18 = result.f176011a;
        java.lang.ref.WeakReference weakReference = this.f175844e;
        yz5.q qVar = this.f175843d;
        boolean z19 = result.f176014d;
        if (z18) {
            java.util.LinkedList linkedList = response.f453048d;
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
                    java.lang.String str = i9Var != null ? i9Var.f458355d : null;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        arrayList.add(next);
                    }
                }
                r45.i9 i9Var2 = arrayList.isEmpty() ^ true ? (r45.i9) arrayList.get(0) : null;
                if (i9Var2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "[findAppMsgContext] url:%s", this.f175845f);
                    if (!z19) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175976i;
                        java.lang.String Url = i9Var2.f458355d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
                        v0Var.c(Url, i9Var2);
                        ax4.c cVar = new ax4.c();
                        cVar.f96651d = result.f176012b;
                        cVar.f96652e = result.f176013c;
                        cVar.f96648a = 1;
                        if (i9Var2.f458360i) {
                            cVar.f96650c++;
                            ax4.a.a(31);
                        } else {
                            cVar.f96649b++;
                            ax4.a.a(32);
                        }
                        cVar.f96653f += i9Var2.mo75928xcd1e8d8();
                        cVar.a();
                    }
                    int i17 = i9Var2.f458366r;
                    java.util.LinkedList linkedList2 = i9Var2.f458369u;
                    r45.zb5 zb5Var = this.f175846g;
                    if (i17 == 8) {
                        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
                        int i18 = zb5Var.f473419h;
                        if (linkedList2 != null && !linkedList2.isEmpty()) {
                            z17 = false;
                        }
                        ((yq1.z) a0Var).z(i18, !z17 ? 20 : 21, 0, 0);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2.f175736a.c(linkedList2, zb5Var.f473419h);
                    qVar.mo147xb9724478(weakReference, result, i9Var2);
                    bool = java.lang.Boolean.TRUE;
                }
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
                result.f176011a = false;
                qVar.mo147xb9724478(weakReference, result, new r45.i9());
            }
        } else {
            qVar.mo147xb9724478(weakReference, result, new r45.i9());
        }
        if (!z19) {
            ax4.a.a(20);
            ax4.a.a(26);
            ax4.a.a(result.f176011a ? 24 : 25);
        }
        return jz5.f0.f384359a;
    }
}
