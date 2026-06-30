package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class i extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f279358d;

    /* renamed from: e, reason: collision with root package name */
    public final int f279359e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence[] f279360f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence[] f279361g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f279362h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f279363i = new java.util.HashMap();

    public i(android.content.Context context, int i17) {
        this.f279358d = context;
        this.f279359e = i17;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f279361g.length;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = com.p314xaae8f345.mm.ui.id.b(this.f279358d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570824c05, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h hVar = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h();
            hVar.f279335a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o3b);
            hVar.f279336b = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bs7);
            hVar.f279337c = (android.widget.RadioButton) view.findViewById(com.p314xaae8f345.mm.R.id.lhs);
            view.setTag(hVar);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h hVar2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h) view.getTag();
        hVar2.f279335a.setText(this.f279360f[i17]);
        int i18 = this.f279359e;
        if (i18 == 1) {
            hVar2.f279336b.setVisibility(8);
            hVar2.f279337c.setVisibility(0);
            hVar2.f279337c.setChecked(this.f279361g[i17].equals(this.f279362h));
        } else if (i18 != 2) {
            hVar2.f279336b.setVisibility(8);
            hVar2.f279337c.setVisibility(8);
        } else {
            hVar2.f279336b.setVisibility(0);
            hVar2.f279337c.setVisibility(8);
            hVar2.f279336b.setChecked(this.f279361g[i17].equals(this.f279362h));
        }
        return view;
    }
}
