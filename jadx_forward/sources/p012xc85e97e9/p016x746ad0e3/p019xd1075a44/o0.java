package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class o0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 f91197d;

    public o0(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6 c0091x9a98b7b6) {
        this.f91197d = r0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var = this.f91197d;
        r0Var.L.setSelection(i17);
        if (r0Var.L.getOnItemClickListener() != null) {
            r0Var.L.performItemClick(view, i17, r0Var.f91228J.getItemId(i17));
        }
        r0Var.mo2732x63a3b28a();
    }
}
