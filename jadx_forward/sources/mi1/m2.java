package mi1;

/* loaded from: classes7.dex */
public class m2 extends java.util.LinkedList {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.t2 f408163d;

    public m2(mi1.t2 t2Var) {
        this.f408163d = t2Var;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean remove(java.lang.Object obj) {
        boolean remove = super.remove(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StackedBlinkingCapsuleBarPart", "resetBlinkState");
        mi1.t2 t2Var = this.f408163d;
        mi1.n2 n2Var = (mi1.n2) t2Var.f408226d.peekFirst();
        if (n2Var == null || n2Var.f408173m != 1) {
            java.lang.CharSequence charSequence = n2Var == null ? null : n2Var.f408168e;
            mi1.g gVar = (mi1.g) t2Var;
            boolean p17 = gVar.p();
            mi1.w0 w0Var = gVar.f408089f;
            if (!p17) {
                w0Var.b(charSequence);
            }
            android.graphics.drawable.Drawable drawable = n2Var != null ? n2Var.f408167d : null;
            gVar.f408090g = drawable;
            if (!gVar.p()) {
                w0Var.c(drawable);
            }
            int i17 = n2Var == null ? Integer.MIN_VALUE : n2Var.f408172i;
            gVar.f408091h = i17;
            if (!gVar.p()) {
                w0Var.f(i17, false);
            }
        } else {
            mi1.g gVar2 = (mi1.g) t2Var;
            boolean p18 = gVar2.p();
            mi1.w0 w0Var2 = gVar2.f408089f;
            if (!p18) {
                w0Var2.i(false);
            }
            if (n2Var.f408171h != null) {
                int i18 = n2Var.f408172i;
                gVar2.f408091h = i18;
                if (!gVar2.p()) {
                    w0Var2.f(i18, true);
                }
                java.util.Map map = n2Var.f408171h;
                gVar2.f408092i = ((mi1.a) map.get("key_type")).ordinal();
                if (!gVar2.p()) {
                    w0Var2.e(map);
                }
                long longValue = ((java.lang.Long) n2Var.f408171h.get("key_show_duration")).longValue();
                mi1.RunnableC29148x6255fdf runnableC29148x6255fdf = new mi1.RunnableC29148x6255fdf(n2Var);
                n2Var.f408174n = runnableC29148x6255fdf;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnableC29148x6255fdf, longValue);
            }
        }
        return remove;
    }
}
