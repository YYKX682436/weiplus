package zs4;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f556826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zs4.q f556827e;

    public i(zs4.q qVar, int i17) {
        this.f556827e = qVar;
        this.f556826d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(1, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), this.f556826d);
        this.f556827e.c(1, -1, "cancel", false);
    }
}
