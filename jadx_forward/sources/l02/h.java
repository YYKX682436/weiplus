package l02;

/* loaded from: classes8.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f396350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m02.q f396351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396352f;

    public h(l02.k kVar, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, m02.q qVar, java.lang.String str) {
        this.f396350d = c19762x487075a;
        this.f396351e = qVar;
        this.f396352f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = this.f396350d;
        c19762x487075a.f38859x6ac9171 = true;
        m02.q qVar = this.f396351e;
        if (qVar != null) {
            qVar.a();
        }
        c19762x487075a.f38859x6ac9171 = true;
        o02.a.b(15, 1502, 1, 23, this.f396352f, "", "");
    }
}
