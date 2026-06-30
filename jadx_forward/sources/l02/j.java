package l02;

/* loaded from: classes8.dex */
public class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m02.q f396358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f396359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396360f;

    public j(l02.k kVar, m02.q qVar, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, java.lang.String str) {
        this.f396358d = qVar;
        this.f396359e = c19762x487075a;
        this.f396360f = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        m02.q qVar = this.f396358d;
        if (qVar != null) {
            qVar.a();
        }
        if (this.f396359e.f38859x6ac9171) {
            return;
        }
        o02.a.b(15, 1502, 1, 2, this.f396360f, "", "");
    }
}
