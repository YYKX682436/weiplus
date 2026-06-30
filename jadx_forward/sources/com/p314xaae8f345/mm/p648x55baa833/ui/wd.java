package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class wd extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f146160e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f146161f;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b f146166n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f146159d = new java.lang.String(java.lang.Character.toChars(91));

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f146162g = new java.util.ArrayList(0);

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f146163h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f146164i = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f146165m = new java.util.HashMap();

    public wd(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10374x1787784b activityC10374x1787784b, android.content.Context context) {
        this.f146166n = activityC10374x1787784b;
        this.f146161f = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f146163h == null || this.f146164i) {
            return 0;
        }
        return this.f146163h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (this.f146163h.size() > i17) {
            return (com.p314xaae8f345.mm.p648x55baa833.ui.xd) this.f146163h.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p648x55baa833.ui.yd ydVar;
        android.view.View view2;
        android.content.Context context = this.f146161f;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570659bd5, null);
            ydVar = new com.p314xaae8f345.mm.p648x55baa833.ui.yd();
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            ydVar.f146228a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.kbq);
            ydVar.f146229b = textView;
            textView.setMaxWidth((windowManager.getDefaultDisplay().getWidth() * 2) / 3);
            ydVar.f146230c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f567525jt4);
            ydVar.f146231d = view2.findViewById(com.p314xaae8f345.mm.R.id.jt6);
            view2.setTag(ydVar);
            view2.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.ud(this));
        } else {
            ydVar = (com.p314xaae8f345.mm.p648x55baa833.ui.yd) view.getTag();
            view2 = view;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.xd xdVar = this.f146163h.size() > i17 ? (com.p314xaae8f345.mm.p648x55baa833.ui.xd) this.f146163h.get(i17) : null;
        if (xdVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceNotifyAdapter", "null == item! position:%s, count:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()));
            return view2;
        }
        if (i17 < getCount() - 1) {
            android.view.View view3 = ydVar.f146231d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = ydVar.f146231d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = xdVar.f146205a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(ydVar.f146228a, z3Var.d1());
        java.lang.String f27 = z3Var.f2();
        if (this.f146162g != this.f146163h) {
            p13.i a17 = p13.i.a(f27, this.f146160e, false, false);
            a17.f432633h = ydVar.f146229b.getPaint();
            ydVar.f146229b.setText(o13.q.e(a17).f432638a);
        } else {
            android.widget.TextView textView2 = ydVar.f146229b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = ydVar.f146229b.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, f27, textSize));
        }
        ydVar.f146230c.setText(this.f146166n.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idv, java.lang.Integer.valueOf(xdVar.f146208d)));
        ydVar.f146232e = i17;
        return view2;
    }
}
