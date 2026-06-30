package jw3;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jw3.i f383853d;

    public e(jw3.i iVar) {
        this.f383853d = iVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        jw3.i iVar = this.f383853d;
        iVar.getClass();
        zg0.i3 i3Var = (zg0.i3) i95.n0.c(zg0.i3.class);
        iw3.f fVar = iw3.f.f376770b;
        ((yg0.i4) i3Var).getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) nw4.d3.f422355b;
        if (arrayList.contains(fVar)) {
            arrayList.remove(fVar);
            arrayList.size();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee = iVar.f383868t;
        if (c12962xa24d9bee != null) {
            c12962xa24d9bee.mo52095x5cd39ffa();
        }
        iVar.f383868t = null;
        zg0.q2 q2Var = iVar.f383859h;
        if (q2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) q2Var).D0();
        }
        android.content.Context context = iVar.f383858g;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        int hashCode = context.hashCode();
        java.util.Map map = hw3.a.f367116a;
        if (map != null) {
            uc0.v vVar = (uc0.v) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Integer.valueOf(hashCode));
            if (vVar != null) {
                vVar.f507823j = null;
                vVar.f507818e = "";
            }
            ((java.util.concurrent.ConcurrentHashMap) hw3.a.f367116a).clear();
            hw3.a.f367116a = null;
        }
        iVar.f383862n = null;
    }
}
