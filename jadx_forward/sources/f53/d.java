package f53;

/* loaded from: classes15.dex */
public final class d implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f341171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef f341172b;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef) {
        this.f341171a = h0Var;
        this.f341172b = c15881xba5ff6ef;
    }

    @Override // vl1.n
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        o33.f fVar;
        android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a5w) : null;
        if (imageView == null || (fVar = (o33.f) ((java.util.LinkedList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864) this.f341171a.f391656d).m64587xd1852f78().f341208e).get(i17)) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        cl0.g gVar = new cl0.g();
        gVar.h("userName", fVar.f424270d);
        gVar.h("nickName", fVar.f424271e);
        jSONObject.put("gamecenterIdentifier", this.f341172b.f221047i);
        jSONObject.put("userData", gVar.toString());
        java.util.ArrayList arrayList = (java.util.ArrayList) f53.f.f341178b;
        if (arrayList.contains(fVar.f424270d)) {
            arrayList.remove(fVar.f424270d);
            imageView.setVisibility(8);
            jSONObject.put("action", "del");
        } else {
            java.lang.String username = fVar.f424270d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
            arrayList.add(username);
            imageView.setVisibility(0);
            jSONObject.put("action", "add");
        }
        if (!f53.f.f341180d) {
            s43.j jVar = s43.i.f484489a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef = f53.f.f341181e;
            if (c15881xba5ff6ef != null) {
                jVar.b(c15881xba5ff6ef.f221047i, jSONObject);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atSomeoneConfig");
                throw null;
            }
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef2 = f53.f.f341181e;
        if (c15881xba5ff6ef2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atSomeoneConfig");
            throw null;
        }
        bundle.putString(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, c15881xba5ff6ef2.f221047i);
        bundle.putString("jsonData", jSONObject.toString());
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, f53.b.class, null);
    }
}
