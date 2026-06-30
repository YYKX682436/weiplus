package xy4;

/* loaded from: classes15.dex */
public class a extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f539694d;

    public a(l75.k0 k0Var) {
        super(k0Var, yy4.a.f550013t2, "LabAppInfo", null);
        this.f539694d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo11260x413cb2b4(yy4.a aVar) {
        yy4.a aVar2 = new yy4.a();
        aVar2.f66634x369ad11 = aVar.f66634x369ad11;
        get(aVar2, new java.lang.String[0]);
        if (aVar.f66653x29106093 != aVar2.f66653x29106093 || aVar.f66657x6e338166 >= aVar2.f66657x6e338166) {
            return super.mo11260x413cb2b4(aVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LabAppInfoStorage", "sequence old origin.seq " + aVar2.f66657x6e338166 + " old.seq " + aVar.f66657x6e338166);
        return false;
    }

    public java.util.List y0() {
        android.database.Cursor mo78085xb5882a6b = mo78085xb5882a6b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (mo78085xb5882a6b.moveToNext()) {
            yy4.a aVar = new yy4.a();
            aVar.mo9015xbf5d97fd(mo78085xb5882a6b);
            arrayList.add(aVar);
        }
        mo78085xb5882a6b.close();
        return arrayList;
    }

    public void z0(java.util.List list) {
        l75.k0 k0Var = this.f539694d;
        long b17 = k0Var != null ? k0Var.b() : -1L;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            yy4.a aVar = (yy4.a) it.next();
            if (!mo11260x413cb2b4(aVar)) {
                mo880xb970c2b9(aVar);
            }
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(b17));
        }
    }
}
