package sz2;

/* loaded from: classes.dex */
public class b extends p012xc85e97e9.p016x746ad0e3.app.i0 {
    public b(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.aa9);
        getWindow().setLayout(-1, -2);
        getWindow().setGravity(80);
        findViewById(com.p314xaae8f345.mm.R.id.dnw).setOnClickListener(new sz2.a(this));
    }
}
