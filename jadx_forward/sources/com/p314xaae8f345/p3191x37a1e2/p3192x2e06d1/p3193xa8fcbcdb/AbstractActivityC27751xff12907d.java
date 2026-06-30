package com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb;

/* renamed from: com.tencent.weui.base.preference.WeUIPreference */
/* loaded from: classes7.dex */
public abstract class AbstractActivityC27751xff12907d extends com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 {
    public android.widget.ListView A;
    public android.content.SharedPreferences B;
    public boolean C = false;

    /* renamed from: z, reason: collision with root package name */
    public ex5.g f301660z;

    public abstract boolean T6(ex5.b bVar, android.preference.Preference preference);

    /* renamed from: getFooterResourceId */
    public int m119876xfe2df53a() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120
    /* renamed from: getLayoutId */
    public int mo32073x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c0n;
    }

    /* renamed from: getResourceId */
    public abstract int m119877x9e0bb9bf();

    @Override // android.app.Activity
    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.B = sharedPreferences;
        this.f301660z = new ex5.g(this, sharedPreferences);
        this.A = (android.widget.ListView) findViewById(android.R.id.list);
        int m119876xfe2df53a = m119876xfe2df53a();
        if (m119876xfe2df53a != -1) {
            this.A.addFooterView(getLayoutInflater().inflate(m119876xfe2df53a, (android.view.ViewGroup) null));
        }
        ex5.g gVar = this.f301660z;
        gVar.f338796s = new ex5.c(this);
        gVar.notifyDataSetChanged();
        int m119877x9e0bb9bf = m119877x9e0bb9bf();
        if (m119877x9e0bb9bf != -1) {
            ex5.g gVar2 = this.f301660z;
            gVar2.f338794q = true;
            ex5.h hVar = gVar2.f338784d;
            hVar.getClass();
            android.content.res.XmlResourceParser xml = hVar.f338799a.getResources().getXml(m119877x9e0bb9bf);
            if (xml != null) {
                try {
                    hVar.c(xml, gVar2, true);
                } finally {
                    xml.close();
                }
            }
            gVar2.f338794q = false;
            gVar2.notifyDataSetChanged();
        }
        this.A.setAdapter((android.widget.ListAdapter) this.f301660z);
        this.A.setOnItemClickListener(new ex5.d(this));
        this.A.setOnItemLongClickListener(new ex5.e(this));
        this.A.setOnScrollListener(new ex5.f(this));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f301660z.notifyDataSetChanged();
        super.onResume();
    }
}
