package ju1;

/* loaded from: classes9.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju1.j0 f383256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju1.o0 f383257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ju1.a f383258c;

    public h0(ju1.j0 j0Var, ju1.o0 o0Var, ju1.a aVar) {
        this.f383256a = j0Var;
        this.f383257b = o0Var;
        this.f383258c = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String ret_msg;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CouponAndGiftCardViewModel", "do delete card errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        ju1.j0 j0Var = this.f383256a;
        j0Var.f383286h.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        int i17 = fVar.f152148a;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = j0Var.f383285g;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.id0 id0Var = (r45.id0) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CouponAndGiftCardViewModel", "do delete card retCode: %s", java.lang.Integer.valueOf(id0Var.f458479d));
            if (id0Var.f458479d == 0) {
                j0Var2.mo7808x76db6cb1(this.f383257b);
                p012xc85e97e9.p093xedfae76a.j0 j0Var3 = j0Var.f383284f;
                java.util.ArrayList arrayList = (java.util.ArrayList) j0Var3.mo3195x754a37bb();
                ju1.a aVar = this.f383258c;
                boolean remove = arrayList != null ? arrayList.remove(aVar) : false;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove card, is removed: ");
                sb6.append(remove);
                sb6.append(", data type: ");
                sb6.append(aVar.f383221a);
                sb6.append(", errMsg: ");
                r45.tt ttVar = aVar.f383223c;
                sb6.append(ttVar != null ? ttVar.f468298d : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CouponAndGiftCardViewModel", sb6.toString());
                if (remove) {
                    int i18 = aVar.f383221a;
                    if (i18 == 1) {
                        java.util.ArrayList arrayList2 = j0Var.f383280q;
                        arrayList2.remove(aVar);
                        if (arrayList2.size() == 1) {
                            java.lang.Object remove2 = arrayList2.remove(0);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove2, "removeAt(...)");
                            ju1.a aVar2 = (ju1.a) remove2;
                            if (arrayList != null) {
                                arrayList.remove(aVar2);
                            }
                        }
                    } else if (i18 == 2) {
                        java.util.ArrayList arrayList3 = j0Var.f383279p;
                        arrayList3.remove(aVar);
                        if (arrayList3.size() == 1) {
                            java.lang.Object remove3 = arrayList3.remove(0);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove3, "removeAt(...)");
                            ju1.a aVar3 = (ju1.a) remove3;
                            if (arrayList != null) {
                                arrayList.remove(aVar3);
                            }
                        }
                    }
                }
                j0Var3.mo7808x76db6cb1(arrayList);
                return jz5.f0.f384359a;
            }
            ret_msg = ((r45.id0) fVar.f152151d).f458480e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ret_msg, "ret_msg");
        } else {
            ret_msg = "";
        }
        ju1.o0 o0Var = ju1.o0.f383313m;
        o0Var.f383315d = ret_msg;
        j0Var2.mo7808x76db6cb1(o0Var);
        return jz5.f0.f384359a;
    }
}
