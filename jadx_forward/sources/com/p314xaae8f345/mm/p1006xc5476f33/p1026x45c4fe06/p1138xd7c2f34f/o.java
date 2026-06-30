package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes4.dex */
public final class o implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu5.c f166361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f166362e;

    public o(wu5.c cVar, int i17) {
        this.f166361d = cVar;
        this.f166362e = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45 c12322x4a5c3c45;
        com.p314xaae8f345.mm.p944x882e457a.f fVar;
        java.lang.String str;
        r45.ie mo11484xe92ab0a8;
        r45.du5 du5Var;
        r45.ie mo11484xe92ab0a82;
        java.lang.Object obj;
        r45.ie ieVar;
        java.lang.String str2 = "";
        try {
            fVar = (com.p314xaae8f345.mm.p944x882e457a.f) this.f166361d.get(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception unused) {
            c12322x4a5c3c45 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45("", -1, "Timeout");
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.k50 k50Var = (r45.k50) fVar.f152151d;
            if ((k50Var == null || (ieVar = k50Var.f76492x92037252) == null || ieVar.f458492d != 0) ? false : true) {
                java.util.LinkedList resp_item_list = k50Var.f459913e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp_item_list, "resp_item_list");
                java.util.Iterator it = resp_item_list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r45.cb0) obj).f452956d == this.f166362e) {
                        break;
                    }
                }
                r45.cb0 cb0Var = (r45.cb0) obj;
                if (cb0Var == null) {
                    c12322x4a5c3c45 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45("", -1, "Response item not found");
                    return c12322x4a5c3c45;
                }
                java.lang.String str3 = cb0Var.f452957e;
                if (str3 == null) {
                    str3 = "";
                }
                int i17 = cb0Var.f452958f;
                r45.du5 du5Var2 = ((r45.k50) fVar.f152151d).mo11484xe92ab0a8().f458493e;
                str = du5Var2 != null ? du5Var2.f454289d : null;
                if (str == null) {
                    java.lang.String str4 = fVar.f152150c;
                    if (str4 != null) {
                        str2 = str4;
                    }
                } else {
                    str2 = str;
                }
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45(str3, i17, str2);
            }
        }
        r45.k50 k50Var2 = (r45.k50) fVar.f152151d;
        int i18 = (k50Var2 == null || (mo11484xe92ab0a82 = k50Var2.mo11484xe92ab0a8()) == null) ? fVar.f152149b : mo11484xe92ab0a82.f458492d;
        r45.k50 k50Var3 = (r45.k50) fVar.f152151d;
        if (k50Var3 != null && (mo11484xe92ab0a8 = k50Var3.mo11484xe92ab0a8()) != null && (du5Var = mo11484xe92ab0a8.f458493e) != null) {
            str = du5Var.f454289d;
        }
        if (str == null && (str = fVar.f152150c) == null) {
            str = "";
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45("", i18, str);
    }
}
