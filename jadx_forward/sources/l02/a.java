package l02;

/* loaded from: classes8.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f396330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f396331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396332f;

    public a(l02.k kVar, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, java.lang.String str) {
        this.f396330d = onClickListener;
        this.f396331e = c19762x487075a;
        this.f396332f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f396330d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i17);
        }
        this.f396331e.f38859x6ac9171 = true;
        o02.a.b(15, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34133x366c91de, 1, 23, this.f396332f, "", "");
    }
}
