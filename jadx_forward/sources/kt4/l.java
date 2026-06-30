package kt4;

/* loaded from: classes9.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f393571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt4.h f393572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f393573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kt4.n f393574g;

    public l(kt4.n nVar, android.widget.EditText editText, jt4.h hVar, android.widget.TextView textView) {
        this.f393574g = nVar;
        this.f393571d = editText;
        this.f393572e = hVar;
        this.f393573f = textView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "click verify btn");
        java.lang.String obj = this.f393571d.getText().toString();
        int length = obj.length();
        kt4.n nVar = this.f393574g;
        if (length == 11) {
            nVar.f420367b.c(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3);
            r45.pz4 pz4Var = (r45.pz4) ((com.p314xaae8f345.mm.p944x882e457a.o) this.f393572e.mo47948x7f0c4558()).f152243a.f152217a;
            nVar.f393577d.f295334c.putInt("key_verify_scene", 2);
            nVar.f420367b.d(new jt4.h(kt4.r.F(nVar.f393577d), pz4Var.f465025e, pz4Var.f465026f, obj, pz4Var.f465029i, nVar.f393577d.G(), true, false, 2, pz4Var.f465034q), true);
            return;
        }
        r45.wz3 wz3Var = new r45.wz3();
        r45.td0 td0Var = new r45.td0();
        wz3Var.f471130f = td0Var;
        td0Var.f467852d = nVar.f420366a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572608bt3);
        wz3Var.f471130f.f467853e = "#FA5151";
        r45.td0 td0Var2 = new r45.td0();
        wz3Var.f471131g = td0Var2;
        td0Var2.f467852d = nVar.f420366a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572607bt2);
        wz3Var.f471131g.f467853e = "#0C4F8E";
        nVar.g(wz3Var, this.f393573f);
    }
}
