package os3;

/* loaded from: classes8.dex */
public class f2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f429610d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f429611e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a f429612f;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a, android.content.Context context) {
        this.f429612f = activityC16934xe33e503a;
        this.f429610d = context;
    }

    public final java.lang.String a(ks3.u uVar) {
        if (uVar == null) {
            return null;
        }
        java.lang.String str = uVar.f393286h;
        char charAt = str.length() > 1 ? str.charAt(0) : '~';
        if (charAt != '{') {
            return (charAt == '~' || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y0(charAt)) ? "~" : java.lang.String.valueOf(charAt);
        }
        char charAt2 = str.charAt(1);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O0(charAt2) ? java.lang.String.valueOf(charAt2) : "~";
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f429612f.f236408i.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (ks3.u) this.f429612f.f236408i.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        os3.e2 e2Var;
        if (view == null || view.getTag() == null) {
            e2Var = new os3.e2(this);
            view = android.view.View.inflate(this.f429610d, com.p314xaae8f345.mm.R.C30864xbddafb2a.cbe, null);
            e2Var.f429597a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ldv);
            e2Var.f429598b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ldx);
            e2Var.f429599c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ldu);
            e2Var.f429600d = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.ldy);
            view.setTag(e2Var);
        } else {
            e2Var = (os3.e2) view.getTag();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a = this.f429612f;
        ks3.u uVar = (ks3.u) activityC16934xe33e503a.f236408i.get(i17);
        ks3.u uVar2 = i17 > 0 ? (ks3.u) activityC16934xe33e503a.f236408i.get(i17 - 1) : null;
        java.lang.String a17 = a(uVar);
        java.lang.String a18 = a(uVar2);
        if (a17 == null) {
            e2Var.f429597a.setVisibility(8);
        } else if (a17.equals(a18)) {
            e2Var.f429597a.setVisibility(8);
        } else {
            e2Var.f429597a.setText(a17.toUpperCase());
            e2Var.f429597a.setVisibility(0);
        }
        e2Var.f429598b.setText(uVar.f393283e);
        e2Var.f429599c.setText(uVar.f393284f);
        e2Var.f429600d.setChecked(((java.util.HashMap) this.f429611e).get(uVar.f393284f) != null);
        return view;
    }
}
