package uf5;

/* loaded from: classes10.dex */
public class r0 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d f508826d;

    public r0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d) {
        this.f508826d = abstractActivityC22347xd7e8b37d;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        boolean equals = "↑".equals(str);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d = this.f508826d;
        if (equals) {
            abstractActivityC22347xd7e8b37d.f288635f.setSelection(0);
            return;
        }
        java.util.HashMap hashMap = abstractActivityC22347xd7e8b37d.f288636g.f508848o;
        int intValue = hashMap.get(str) == null ? -1 : ((java.lang.Integer) hashMap.get(str)).intValue();
        if (intValue != -1) {
            abstractActivityC22347xd7e8b37d.f288635f.setSelection(intValue);
        }
    }
}
