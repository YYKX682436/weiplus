package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class b1 implements y90.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 f288149d;

    public b1(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1) {
        this.f288149d = activityC22292xa218e7a1;
    }

    @Override // y90.j
    public void G2() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1 = this.f288149d;
        if (str != null) {
            int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1.f287871u;
            activityC22292xa218e7a1.getClass();
            if (str.length() > 0) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434 = activityC22292xa218e7a1.f287873e;
                if (c22293x1808c434 != null) {
                    c22293x1808c434.m80406xcd1079b0(false);
                }
                if (str != null || str.length() == 0) {
                    activityC22292xa218e7a1.f287872d.setAdapter((android.widget.ListAdapter) activityC22292xa218e7a1.f287878m);
                    activityC22292xa218e7a1.f287872d.setBackgroundColor(activityC22292xa218e7a1.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a48));
                    activityC22292xa218e7a1.f287878m.notifyDataSetChanged();
                    activityC22292xa218e7a1.f287879n.y(false);
                    activityC22292xa218e7a1.f287878m.q();
                }
                android.view.View view = activityC22292xa218e7a1.f287875g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI", "doQuery", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/ChatroomContactUI", "doQuery", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC22292xa218e7a1.f287872d.setAdapter((android.widget.ListAdapter) activityC22292xa218e7a1.f287879n);
                activityC22292xa218e7a1.f287872d.setBackgroundColor(activityC22292xa218e7a1.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
                activityC22292xa218e7a1.f287879n.y(true);
                yk5.u uVar = activityC22292xa218e7a1.f287879n;
                uVar.getClass();
                java.lang.String trim = str.trim();
                if (trim.startsWith("@")) {
                    trim = trim.substring(1) + "%@micromsg.with.all.biz.qq.com";
                }
                if (trim != null && !trim.equals(uVar.f544439p)) {
                    uVar.x(new yk5.r(uVar));
                }
                uVar.f544439p = trim;
                uVar.f544438o = null;
                if (trim == null) {
                    uVar.f544439p = "";
                }
                uVar.c();
                uVar.x(new yk5.q(uVar, true));
                activityC22292xa218e7a1.f287879n.notifyDataSetChanged();
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c4342 = activityC22292xa218e7a1.f287873e;
        if (c22293x1808c4342 != null) {
            c22293x1808c4342.m80406xcd1079b0(true);
        }
        if (str != null) {
        }
        activityC22292xa218e7a1.f287872d.setAdapter((android.widget.ListAdapter) activityC22292xa218e7a1.f287878m);
        activityC22292xa218e7a1.f287872d.setBackgroundColor(activityC22292xa218e7a1.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a48));
        activityC22292xa218e7a1.f287878m.notifyDataSetChanged();
        activityC22292xa218e7a1.f287879n.y(false);
        activityC22292xa218e7a1.f287878m.q();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
        android.view.View view = this.f288149d.f287875g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onEnterSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1 = this.f288149d;
        activityC22292xa218e7a1.f287872d.setAdapter((android.widget.ListAdapter) activityC22292xa218e7a1.f287878m);
        activityC22292xa218e7a1.f287878m.notifyDataSetChanged();
        activityC22292xa218e7a1.f287879n.y(false);
        android.view.View view = activityC22292xa218e7a1.f287875g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // y90.j
    public void m6() {
        this.f288149d.mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22292xa218e7a1 activityC22292xa218e7a1 = this.f288149d;
        if (z17) {
            android.content.Intent intent = new android.content.Intent(activityC22292xa218e7a1.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22593x47ef56eb.class);
            intent.putExtra("VoiceSearchResultUI_Resultlist", strArr);
            intent.putExtra("VoiceSearchResultUI_VoiceId", j17);
            intent.putExtra("VoiceSearchResultUI_ShowType", i17);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22292xa218e7a1.mo55332x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(activityC22292xa218e7a1.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2745x3238195a.ActivityC22593x47ef56eb.class);
        intent2.putExtra("VoiceSearchResultUI_Resultlist", new java.lang.String[0]);
        intent2.putExtra("VoiceSearchResultUI_Error", activityC22292xa218e7a1.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu));
        intent2.putExtra("VoiceSearchResultUI_VoiceId", j17);
        intent2.putExtra("VoiceSearchResultUI_ShowType", i17);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC22292xa218e7a1.mo55332x76847179();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo55332x768471792, arrayList2.toArray(), "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x768471792.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mo55332x768471792, "com/tencent/mm/ui/contact/ChatroomContactUI$4", "onVoiceReturn", "(Z[Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
