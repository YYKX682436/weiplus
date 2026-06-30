package o;

/* loaded from: classes15.dex */
public class o extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final o.r f423306d;

    /* renamed from: e, reason: collision with root package name */
    public int f423307e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f423308f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f423309g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.LayoutInflater f423310h;

    /* renamed from: i, reason: collision with root package name */
    public final int f423311i;

    public o(o.r rVar, android.view.LayoutInflater layoutInflater, boolean z17, int i17) {
        this.f423309g = z17;
        this.f423310h = layoutInflater;
        this.f423306d = rVar;
        this.f423311i = i17;
        a();
    }

    public void a() {
        o.r rVar = this.f423306d;
        o.u uVar = rVar.B;
        if (uVar != null) {
            rVar.i();
            java.util.ArrayList arrayList = rVar.f423322p;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (((o.u) arrayList.get(i17)) == uVar) {
                    this.f423307e = i17;
                    return;
                }
            }
        }
        this.f423307e = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.u getItem(int i17) {
        java.util.ArrayList l17;
        boolean z17 = this.f423309g;
        o.r rVar = this.f423306d;
        if (z17) {
            rVar.i();
            l17 = rVar.f423322p;
        } else {
            l17 = rVar.l();
        }
        int i18 = this.f423307e;
        if (i18 >= 0 && i17 >= i18) {
            i17++;
        }
        return (o.u) l17.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList l17;
        boolean z17 = this.f423309g;
        o.r rVar = this.f423306d;
        if (z17) {
            rVar.i();
            l17 = rVar.f423322p;
        } else {
            l17 = rVar.l();
        }
        return this.f423307e < 0 ? l17.size() : l17.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f423310h.inflate(this.f423311i, viewGroup, false);
        }
        int i18 = getItem(i17).f423338e;
        int i19 = i17 - 1;
        p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.C0071x6fd65eb5 c0071x6fd65eb5 = (p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.C0071x6fd65eb5) view;
        c0071x6fd65eb5.m2589xf1dda685(this.f423306d.m() && i18 != (i19 >= 0 ? getItem(i19).f423338e : i18));
        o.h0 h0Var = (o.h0) view;
        if (this.f423308f) {
            c0071x6fd65eb5.m2588xe352bbdf(true);
        }
        h0Var.a(getItem(i17), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
