package f53;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 f341174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef f341175e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 activityC15876x18f56825, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef) {
        this.f341174d = activityC15876x18f56825;
        this.f341175e = c15881xba5ff6ef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f341174d);
        android.widget.FrameLayout frameLayout = this.f341174d.f221027d.f488195c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(frameLayout, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdx, (android.view.ViewGroup) frameLayout, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564813a61);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        h0Var.f391656d = findViewById;
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef = this.f341175e;
        bundle.putString("contentId", c15881xba5ff6ef.f221048m);
        java.lang.String str = c15881xba5ff6ef.f221049n;
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            bundle.putByteArray("context", bytes);
        }
        bundle.putInt("limit", c15881xba5ff6ef.f221050o);
        cl0.e eVar = f53.f.f341177a;
        java.lang.String str2 = this.f341175e.f221046h;
        if (str2 == null) {
            str2 = "";
        }
        f53.f.f341179c = str2;
        if (!(f53.f.f341179c.length() == 0)) {
            try {
                f53.f.f341179c = "{\"atList\":" + f53.f.f341179c + '}';
                cl0.e jSONArray = new cl0.g(f53.f.f341179c).getJSONArray("atList");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "getJSONArray(...)");
                f53.f.f341177a = jSONArray;
                int mo15056xbe0e3ae6 = jSONArray.mo15056xbe0e3ae6();
                for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                    cl0.e eVar2 = f53.f.f341177a;
                    if (eVar2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atList");
                        throw null;
                    }
                    java.lang.String mo15054x2fec8307 = eVar2.mo15054x2fec8307(i17);
                    java.util.List list = f53.f.f341178b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15054x2fec8307);
                    ((java.util.ArrayList) list).add(mo15054x2fec8307);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AtSomeoneUI", "parse data error, exception : %s", e17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 activityC15876x18f56825 = this.f341174d;
        activityC15876x18f56825.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = activityC15876x18f56825.f221031h;
        android.view.View view = !concurrentHashMap.containsKey("atSomeoneView") ? null : (android.view.View) concurrentHashMap.get("atSomeoneView");
        if (view != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc4864 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864) view.findViewById(com.p314xaae8f345.mm.R.id.f564813a61);
            if (c15901xbfc4864 != null) {
                h0Var.f391656d = c15901xbfc4864;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864) h0Var.f391656d).m64588xa582aeec(f53.f.f341178b);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864) h0Var.f391656d).n1(this.f341175e.f221042d);
            inflate = view;
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864) h0Var.f391656d).m64588xa582aeec(f53.f.f341178b);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc48642 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864) h0Var.f391656d;
            f53.c cVar = new f53.c(this.f341175e, h0Var);
            c15901xbfc48642.f221515o2 = bundle;
            c15901xbfc48642.m1(cVar);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864) h0Var.f391656d).m53687xa1aeda28(new f53.d(h0Var, this.f341175e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef2 = this.f341175e;
        if (c15881xba5ff6ef2.f221043e && c15881xba5ff6ef2.f221044f) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = inflate;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view3 = inflate;
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef3 = f53.f.f341181e;
            if (c15881xba5ff6ef3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atSomeoneConfig");
                throw null;
            }
            jSONObject.put("gamecenterIdentifier", c15881xba5ff6ef3.f221047i);
            jSONObject.put("atUserNameList", new org.json.JSONArray((java.util.Collection) f53.f.f341178b));
            if (f53.f.f341180d) {
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef4 = f53.f.f341181e;
                if (c15881xba5ff6ef4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atSomeoneConfig");
                    throw null;
                }
                bundle2.putString(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, c15881xba5ff6ef4.f221047i);
                bundle2.putString("jsonData", jSONObject.toString());
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str3, bundle2, f53.a.class, null);
            } else {
                s43.j jVar = s43.i.f484489a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.api.C15881xba5ff6ef c15881xba5ff6ef5 = f53.f.f341181e;
                if (c15881xba5ff6ef5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atSomeoneConfig");
                    throw null;
                }
                jVar.a(c15881xba5ff6ef5.f221047i, jSONObject);
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = this.f341175e.f221051p;
        layoutParams.gravity = 80;
        inflate.setLayoutParams(layoutParams);
        if (this.f341175e.f221044f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 activityC15876x18f568252 = this.f341174d;
            activityC15876x18f568252.getClass();
            if (activityC15876x18f568252.f221031h.containsKey("atSomeoneView")) {
                return;
            }
            android.widget.FrameLayout frameLayout2 = activityC15876x18f568252.f221027d.f488195c;
            if (frameLayout2 instanceof android.widget.FrameLayout) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.n0(activityC15876x18f568252, frameLayout2, inflate, "atSomeoneView"));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825 activityC15876x18f568253 = this.f341174d;
        activityC15876x18f568253.getClass();
        if (activityC15876x18f568253.f221031h.containsKey("atSomeoneView")) {
            android.widget.FrameLayout frameLayout3 = activityC15876x18f568253.f221027d.f488195c;
            if (frameLayout3 instanceof android.widget.FrameLayout) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.o0(activityC15876x18f568253, frameLayout3, "atSomeoneView"));
            }
        }
    }
}
