package mb1;

/* loaded from: classes7.dex */
public class a extends ob1.c {
    @Override // ob1.c
    public void l() {
        if (this.f425519a.f399250e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Ble.Action", "connection is not open.", new java.lang.Object[0]);
            p(ob1.m.f425558l);
            m();
        } else {
            this.f425519a.k(true);
            p(ob1.m.f425551e);
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "CloseAction";
    }
}
