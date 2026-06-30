package l02;

/* loaded from: classes8.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m02.q f396355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f396356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396357f;

    public i(l02.k kVar, m02.q qVar, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, java.lang.String str) {
        this.f396355d = qVar;
        this.f396356e = c19762x487075a;
        this.f396357f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        m02.q qVar = this.f396355d;
        if (qVar != null) {
            qVar.a();
        }
        this.f396356e.f38859x6ac9171 = true;
        o02.a.b(15, 1502, 1, 3, this.f396357f, "", "");
    }
}
