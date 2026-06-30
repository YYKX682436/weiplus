package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class wd extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f64627e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f64628f;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI f64633n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f64626d = new java.lang.String(java.lang.Character.toChars(91));

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f64629g = new java.util.ArrayList(0);

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f64630h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f64631i = false;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f64632m = new java.util.HashMap();

    public wd(com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI selectServiceNotifySenderUI, android.content.Context context) {
        this.f64633n = selectServiceNotifySenderUI;
        this.f64628f = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f64630h == null || this.f64631i) {
            return 0;
        }
        return this.f64630h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (this.f64630h.size() > i17) {
            return (com.tencent.mm.chatroom.ui.xd) this.f64630h.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.chatroom.ui.yd ydVar;
        android.view.View view2;
        android.content.Context context = this.f64628f;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f489126bd5, null);
            ydVar = new com.tencent.mm.chatroom.ui.yd();
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            ydVar.f64695a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.a_4);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.kbq);
            ydVar.f64696b = textView;
            textView.setMaxWidth((windowManager.getDefaultDisplay().getWidth() * 2) / 3);
            ydVar.f64697c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f485992jt4);
            ydVar.f64698d = view2.findViewById(com.tencent.mm.R.id.jt6);
            view2.setTag(ydVar);
            view2.setOnClickListener(new com.tencent.mm.chatroom.ui.ud(this));
        } else {
            ydVar = (com.tencent.mm.chatroom.ui.yd) view.getTag();
            view2 = view;
        }
        com.tencent.mm.chatroom.ui.xd xdVar = this.f64630h.size() > i17 ? (com.tencent.mm.chatroom.ui.xd) this.f64630h.get(i17) : null;
        if (xdVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ServiceNotifyAdapter", "null == item! position:%s, count:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()));
            return view2;
        }
        if (i17 < getCount() - 1) {
            android.view.View view3 = ydVar.f64698d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = ydVar.f64698d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.storage.z3 z3Var = xdVar.f64672a;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(ydVar.f64695a, z3Var.d1());
        java.lang.String f27 = z3Var.f2();
        if (this.f64629g != this.f64630h) {
            p13.i a17 = p13.i.a(f27, this.f64627e, false, false);
            a17.f351100h = ydVar.f64696b.getPaint();
            ydVar.f64696b.setText(o13.q.e(a17).f351105a);
        } else {
            android.widget.TextView textView2 = ydVar.f64696b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = ydVar.f64696b.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, f27, textSize));
        }
        ydVar.f64697c.setText(this.f64633n.getString(com.tencent.mm.R.string.idv, java.lang.Integer.valueOf(xdVar.f64675d)));
        ydVar.f64699e = i17;
        return view2;
    }
}
