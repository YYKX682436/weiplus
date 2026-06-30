package p53;

/* loaded from: classes8.dex */
public class c extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f433585d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d f433586e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433587f;

    public c(android.content.Context context) {
        this.f433585d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d c15921xfed2506d = this.f433586e;
        if (c15921xfed2506d == null) {
            return 0;
        }
        return ((java.util.ArrayList) c15921xfed2506d.a()).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem) ((java.util.ArrayList) this.f433586e.a()).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f433585d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bhx, viewGroup, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.avt);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.avq);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15921xfed2506d.TabItem) ((java.util.ArrayList) this.f433586e.a()).get(i17);
        if (tabItem != null) {
            textView.setText(tabItem.f221689e);
            java.lang.String str = this.f433587f;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            if (str.equalsIgnoreCase(tabItem.f221688d)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tabItem.f221696o)) {
                    java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a3.f221733f + kk.k.g(tabItem.f221696o.getBytes());
                    o11.f fVar = new o11.f();
                    fVar.f423611b = true;
                    fVar.f423615f = str2;
                    n11.a.b().h(tabItem.f221696o, imageView, fVar.a());
                }
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tabItem.f221695n)) {
                java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a3.f221733f + kk.k.g(tabItem.f221695n.getBytes());
                o11.f fVar2 = new o11.f();
                fVar2.f423611b = true;
                fVar2.f423615f = str3;
                n11.a.b().h(tabItem.f221695n, imageView, fVar2.a());
            }
        }
        inflate.setTag(tabItem);
        return inflate;
    }
}
