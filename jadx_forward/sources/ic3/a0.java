package ic3;

/* loaded from: classes12.dex */
public final class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f371921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371922e;

    public a0(android.widget.EditText editText, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371921d = editText;
        this.f371922e = activityC16419x510d00b7;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        java.lang.Long j17 = r26.h0.j(r26.n0.u0(this.f371921d.getText().toString()).toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371922e;
        if (j17 == null || j17.longValue() < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "⚠️ 请输入非负整数");
            return;
        }
        long j18 = activityC16419x510d00b7.f229389m;
        activityC16419x510d00b7.f229389m = j17.longValue();
        activityC16419x510d00b7.V6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16419x510d00b7.f229383d, "changeTimeout " + j18 + " -> " + j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("超时已设为 ");
        if (j17.longValue() == 0) {
            str = "无超时";
        } else {
            str = j17 + "ms";
        }
        sb6.append(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, sb6.toString());
    }
}
