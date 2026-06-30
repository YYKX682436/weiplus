package fg4;

/* loaded from: classes8.dex */
public class l extends android.widget.BaseAdapter implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f344012d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f344013e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f344014f;

    public l(android.content.Context context, java.util.List list) {
        this.f344012d = context;
        this.f344014f = list;
    }

    public boolean a(int i17) {
        java.util.List list = this.f344014f;
        int size = list.size();
        return i17 >= size && i17 < size + ((4 - (list.size() % 4)) % 4);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f344014f;
        return list.size() + ((4 - (list.size() % 4)) % 4);
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (a(i17)) {
            return null;
        }
        return this.f344014f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        fg4.p pVar;
        android.view.View view2;
        android.content.Context context = this.f344012d;
        if (view == null) {
            pVar = new fg4.p();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569661hx, null);
            pVar.f344018a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a3c);
            pVar.f344019b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.a3b);
            pVar.f344020c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.a3d);
            pVar.f344021d = view2.findViewById(com.p314xaae8f345.mm.R.id.a3e);
            view2.setTag(pVar);
        } else {
            pVar = (fg4.p) view.getTag();
            view2 = view;
        }
        android.view.View view3 = pVar.f344021d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (a(i17)) {
            pVar.f344018a.setVisibility(4);
            pVar.f344019b.setVisibility(4);
            pVar.f344020c.setVisibility(4);
            return view2;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) getItem(i17);
        pVar.f344018a.setVisibility(0);
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(mVar.f67370x28d45f97, 5, i65.a.g(context));
        if (Di == null) {
            pVar.f344018a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562382bg4);
        } else {
            pVar.f344018a.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(Di));
        }
        pVar.f344020c.setVisibility(0);
        pVar.f344020c.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(context, mVar));
        if (this.f344013e) {
            pVar.f344019b.setVisibility(0);
        } else {
            pVar.f344019b.setVisibility(8);
        }
        return view2;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        notifyDataSetChanged();
    }
}
