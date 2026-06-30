package zo1;

/* loaded from: classes5.dex */
public final class y0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final po1.d f556359d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f556360e = kz5.p0.f395529d;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f556361f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f556362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556363h;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, po1.d dVar) {
        this.f556363h = activityC12868xd8a7d79e;
        this.f556359d = dVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f556360e.size() + 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (po1.d) this.f556360e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (view == null) {
            view = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dwg, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            view.setTag(new zo1.v0(this, view));
        }
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.DeviceListAdapter.ViewHolder");
        zo1.v0 v0Var = (zo1.v0) tag;
        int size = this.f556360e.size();
        android.widget.TextView textView = v0Var.f556328g;
        android.view.View view2 = v0Var.f556322a;
        android.widget.LinearLayout linearLayout = v0Var.f556327f;
        if (i17 == size) {
            textView.setVisibility(0);
            linearLayout.setVisibility(8);
            view2.setOnClickListener(new zo1.w0(this));
            return view;
        }
        textView.setVisibility(8);
        linearLayout.setVisibility(0);
        po1.d dVar = (po1.d) this.f556360e.get(i17);
        int ordinal = dVar.f438829b.ordinal();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = v0Var.f556323b;
        android.widget.TextView textView2 = v0Var.f556325d;
        if (ordinal == 0 || ordinal == 1) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80080x185fe337);
            if (dVar.f438835h) {
                textView2.setVisibility(0);
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574388mx4);
            } else {
                textView2.setVisibility(8);
            }
        } else if (ordinal != 2) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80343xde51652c);
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80343xde51652c);
            textView2.setVisibility(0);
            textView2.setText(dVar.f438832e);
        }
        v0Var.f556324c.setText(dVar.b());
        po1.g gVar = dVar.f438829b;
        po1.g gVar2 = po1.g.f438843h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = v0Var.f556326e;
        if (gVar == gVar2 && ro1.v.f479547a.f(dVar)) {
            java.lang.String str = dVar.f438833f;
            po1.d dVar2 = this.f556363h.f174360s;
            c22699x3dcdb3522.setVisibility(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, dVar2 != null ? dVar2.f438833f : null) ? 0 : 8);
        } else {
            java.lang.String str2 = dVar.f438828a;
            po1.d dVar3 = this.f556359d;
            c22699x3dcdb3522.setVisibility(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, dVar3 != null ? dVar3.f438828a : null) ? 0 : 8);
        }
        view2.setOnClickListener(new zo1.x0(this, dVar));
        return view;
    }
}
