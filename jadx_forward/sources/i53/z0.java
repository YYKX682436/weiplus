package i53;

/* loaded from: classes8.dex */
public class z0 implements i53.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de f370335a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de) {
        this.f370335a = c15908x78af54de;
    }

    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de = this.f370335a;
        if (i17 > 0) {
            c15908x78af54de.f221581g.setText(c15908x78af54de.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fnf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c15908x78af54de.f221582h)));
            c15908x78af54de.f221581g.setEnabled(true);
            c15908x78af54de.f221580f.setVisibility(0);
            c15908x78af54de.f221580f.setText(c15908x78af54de.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fnh));
            return;
        }
        c15908x78af54de.f221581g.setText(c15908x78af54de.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fne));
        c15908x78af54de.f221581g.setEnabled(false);
        if (c15908x78af54de.f221584m) {
            c15908x78af54de.f221580f.setVisibility(8);
        } else {
            c15908x78af54de.f221580f.setVisibility(0);
            c15908x78af54de.f221580f.setText(c15908x78af54de.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fng));
        }
    }
}
