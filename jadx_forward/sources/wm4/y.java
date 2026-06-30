package wm4;

/* loaded from: classes8.dex */
public class y {

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f528860k;

    /* renamed from: m, reason: collision with root package name */
    public oa.i f528862m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f528863n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f528864o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f528865p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f528866q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f528867r;

    /* renamed from: s, reason: collision with root package name */
    public int f528868s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f528869t;

    /* renamed from: u, reason: collision with root package name */
    public int f528870u;

    /* renamed from: v, reason: collision with root package name */
    public int f528871v;

    /* renamed from: w, reason: collision with root package name */
    public int f528872w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f528873x;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f528850a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f528851b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f528852c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f528853d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f528854e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f528855f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f528856g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f528857h = "";

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f528858i = null;

    /* renamed from: j, reason: collision with root package name */
    public r45.f03 f528859j = null;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f528861l = "";

    public void a(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var) {
        java.lang.String str2 = "category:%s updateContentRedDot() called with: curNum = [" + i17 + "], msgId = [" + str + "] contentRedDotShowInfo!=null:%s contentRedDotShowInfo!=null:%s ";
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(this.f528851b);
        objArr[1] = java.lang.Boolean.valueOf(f03Var != null);
        objArr[2] = java.lang.Boolean.valueOf(f03Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryUILogic", str2, objArr);
        this.f528855f = i17;
        this.f528857h = str;
        this.f528858i = jbVar;
        this.f528859j = f03Var;
        android.widget.TextView textView = this.f528865p;
        if (textView != null) {
            if (i17 <= 0) {
                android.view.View view = this.f528867r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;Lcom/tencent/mm/protocal/protobuf/FinderTipsShowInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;Lcom/tencent/mm/protocal/protobuf/FinderTipsShowInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (this.f528856g <= 0) {
                textView.setVisibility(8);
                android.view.View view2 = this.f528867r;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;Lcom/tencent/mm/protocal/protobuf/FinderTipsShowInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateContentRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;Lcom/tencent/mm/protocal/protobuf/FinderTipsShowInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        c(this);
    }

    public void b(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryUILogic", "updateNumberRedDot() called with: curNum = [" + i17 + "], msgId = [" + str + "]");
        this.f528856g = i17;
        this.f528861l = str;
        this.f528860k = jbVar;
        if (i17 <= 0) {
            android.widget.TextView textView = this.f528865p;
            if (textView != null) {
                textView.setText("");
                this.f528865p.setVisibility(8);
                int i18 = this.f528855f;
                if (i18 > 0) {
                    a(i18, this.f528857h, null, null);
                }
            }
        } else {
            java.lang.String str2 = "" + this.f528856g;
            if (this.f528856g > 99) {
                str2 = "99+";
            }
            android.widget.TextView textView2 = this.f528865p;
            if (textView2 != null) {
                textView2.setText(str2);
                this.f528865p.setVisibility(0);
                android.view.View view = this.f528867r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateNumberRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/TopStoryUILogic$TabItem", "updateNumberRedDot", "(ILjava/lang/String;Lcom/tencent/mm/plugin/finder/extension/reddot/LocalFinderRedDotCtrInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        c(this);
    }

    public void c(wm4.y yVar) {
        if (yVar.f528864o == null) {
            return;
        }
        android.widget.TextView textView = yVar.f528865p;
        if (textView != null && textView.getVisibility() == 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(yVar.f528865p.getText())) {
                yVar.f528864o.setContentDescription(yVar.f528850a + yVar.f528864o.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574926k10));
                return;
            }
            yVar.f528864o.setContentDescription(yVar.f528850a + yVar.f528864o.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571247n, yVar.f528865p.getText()) + yVar.f528864o.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574926k10));
            return;
        }
        android.view.View view = yVar.f528867r;
        if (view == null || view.getVisibility() != 0) {
            yVar.f528864o.setContentDescription(yVar.f528850a + yVar.f528864o.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574926k10));
            return;
        }
        android.widget.TextView textView2 = yVar.f528864o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(yVar.f528850a);
        sb6.append(yVar.f528867r.getVisibility() == 0 ? yVar.f528867r.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571246m) : "");
        sb6.append(yVar.f528864o.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574926k10));
        textView2.setContentDescription(sb6.toString());
    }

    /* renamed from: toString */
    public java.lang.String m174161x9616526c() {
        return java.lang.String.format("tabType=%s,category=%s,wording=%s;", 0, java.lang.Integer.valueOf(this.f528851b), this.f528850a);
    }
}
