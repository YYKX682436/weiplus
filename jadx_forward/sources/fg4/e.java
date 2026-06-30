package fg4;

/* loaded from: classes8.dex */
public class e extends android.widget.BaseAdapter implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f344003d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f344004e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f344005f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f344006g;

    public e(android.content.Context context, int i17) {
        this.f344005f = 0;
        this.f344003d = context;
        this.f344005f = i17;
        a();
    }

    public final void a() {
        this.f344006g = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Di = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di();
        Di.getClass();
        android.database.Cursor m145256x1d3f4980 = Di.m145256x1d3f4980("select * from AppInfo where status = " + this.f344005f + " and (appType is null or appType not like ',1,')", new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "getAppByStatusExcludeByType: curosr is null");
            m145256x1d3f4980 = null;
        }
        if (m145256x1d3f4980 != null) {
            int count = m145256x1d3f4980.getCount();
            for (int i17 = 0; i17 < count; i17++) {
                m145256x1d3f4980.moveToPosition(i17);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
                mVar.mo9015xbf5d97fd(m145256x1d3f4980);
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = mVar.f67370x28d45f97;
                ((kt.c) i0Var).getClass();
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(this.f344003d, str)) {
                    this.f344006g.add(mVar);
                }
            }
            m145256x1d3f4980.close();
        }
    }

    public boolean c(int i17) {
        int size = ((java.util.ArrayList) this.f344006g).size();
        return i17 >= size && i17 < size + ((4 - (((java.util.ArrayList) this.f344006g).size() % 4)) % 4);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f344006g).size() + ((4 - (((java.util.ArrayList) this.f344006g).size() % 4)) % 4);
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (c(i17)) {
            return null;
        }
        return ((java.util.ArrayList) this.f344006g).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fg4.s sVar;
        android.view.View view2;
        android.content.Context context = this.f344003d;
        if (view == null) {
            sVar = new fg4.s();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569661hx, null);
            sVar.f344024a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a3c);
            sVar.f344025b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.a3b);
            sVar.f344026c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.a3d);
            sVar.f344027d = view2.findViewById(com.p314xaae8f345.mm.R.id.a3e);
            view2.setTag(sVar);
        } else {
            sVar = (fg4.s) view.getTag();
            view2 = view;
        }
        android.view.View view3 = sVar.f344027d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/openapi/AppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/subapp/ui/openapi/AppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (c(i17)) {
            sVar.f344024a.setVisibility(4);
            sVar.f344025b.setVisibility(4);
            sVar.f344026c.setVisibility(4);
            return view2;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) getItem(i17);
        sVar.f344024a.setVisibility(0);
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(mVar.f67370x28d45f97, 1, i65.a.g(context));
        if (Di == null) {
            sVar.f344024a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562382bg4);
        } else {
            sVar.f344024a.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(Di));
        }
        sVar.f344026c.setVisibility(0);
        sVar.f344026c.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(context, mVar));
        if (this.f344004e) {
            sVar.f344025b.setVisibility(0);
        } else {
            sVar.f344025b.setVisibility(8);
        }
        return view2;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        a();
        notifyDataSetChanged();
    }
}
