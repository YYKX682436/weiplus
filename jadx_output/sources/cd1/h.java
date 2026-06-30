package cd1;

/* loaded from: classes7.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cd1.i f40621f;

    public h(cd1.i iVar, int i17, java.lang.String str) {
        this.f40621f = iVar;
        this.f40619d = i17;
        this.f40620e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f40621f.e(this.f40619d, this.f40620e);
    }
}
