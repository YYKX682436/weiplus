package rn2;

/* loaded from: classes15.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(rn2.t2 t2Var) {
        super(0);
        this.f479467d = t2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [rn2.l0] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rn2.w wVar;
        ?? linkedList;
        r45.gz1 gz1Var;
        android.text.Editable text;
        rn2.t2 t2Var = this.f479467d;
        rn2.f fVar = t2Var.f479387f;
        if (fVar != null) {
            android.widget.EditText editText = t2Var.C;
            rn2.c1 c1Var = (rn2.c1) fVar;
            c1Var.f479204n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((editText == null || (text = editText.getText()) == null) ? null : text.toString(), 0);
            c1Var.g(c1Var.f479201h, true);
        }
        rn2.f fVar2 = t2Var.f479387f;
        if (((fVar2 == null || (gz1Var = ((rn2.c1) fVar2).f479216z) == null || gz1Var.m75939xb282bd08(0) != 2) ? false : true) && (wVar = t2Var.W) != null) {
            r45.gz1 gz1Var2 = fVar2 != null ? ((rn2.c1) fVar2).f479216z : null;
            java.util.LinkedList m17 = fVar2 != null ? ((rn2.c1) fVar2).m() : null;
            java.lang.String str = wVar.f479436b;
            if (gz1Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "updateWinnerCnt but prizeMethod is null");
            } else if (gz1Var2.m75939xb282bd08(0) != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "updateWinnerCnt but prize_type:" + gz1Var2.m75939xb282bd08(0) + " is error!");
            } else {
                if (m17 != null) {
                    linkedList = new java.util.ArrayList();
                    for (java.lang.Object obj : m17) {
                        if (((rn2.y2) obj).f479459a) {
                            linkedList.add(obj);
                        }
                    }
                } else {
                    linkedList = new java.util.LinkedList();
                }
                rn2.t2 t2Var2 = wVar.f479435a;
                rn2.f fVar3 = t2Var2.f479387f;
                int i17 = fVar3 != null ? ((rn2.c1) fVar3).f479204n : 0;
                ?? r86 = rn2.l0.f479325a;
                r45.vd4 vd4Var = (r45.vd4) gz1Var2.m75936x14adae67(2);
                int c17 = r86.c(vd4Var != null ? java.lang.Integer.valueOf(vd4Var.m75939xb282bd08(0)) : null, i17, linkedList);
                java.util.Iterator it = linkedList.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    i18 += ((rn2.y2) it.next()).f479461c.m75939xb282bd08(1);
                }
                android.widget.TextView textView = t2Var2.f479410y1;
                if (textView != null) {
                    textView.setText(java.lang.String.valueOf(c17));
                }
                r45.vd4 vd4Var2 = (r45.vd4) gz1Var2.m75936x14adae67(2);
                if (vd4Var2 != null && vd4Var2.m75939xb282bd08(0) == 1) {
                    boolean z17 = i18 < i17;
                    java.lang.String string = t2Var2.f479386e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.liz);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    t2Var2.v(z17, string);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
