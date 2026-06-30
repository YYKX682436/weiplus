package z71;

@j95.b
/* loaded from: classes8.dex */
public class i extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f552059d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public z71.b0 f552060e;

    public final void wi(java.lang.String str, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiSessionData", "handleSessionEvent sessionId[%s]", str);
        int[] wi6 = z71.f.Bi().wi();
        z71.b0 b0Var = new z71.b0();
        b0Var.f552044a = str;
        b0Var.f552045b = j17;
        this.f552060e = b0Var;
        java.util.LinkedList linkedList = this.f552059d;
        linkedList.add(b0Var);
        int size = linkedList.size();
        if (size < 1) {
            return;
        }
        z71.b0 b0Var2 = (z71.b0) linkedList.get(size - 1);
        z71.b0 b0Var3 = size >= 2 ? (z71.b0) linkedList.get(size - 2) : null;
        z71.b0 b0Var4 = size >= 3 ? (z71.b0) linkedList.get(size - 3) : null;
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (b0Var3 != null && "2".equals(b0Var3.f552044a)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5865x48f502ce c5865x48f502ce = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5865x48f502ce();
            java.lang.String str2 = b0Var4 != null ? b0Var4.f552044a : "unknow";
            am.hp hpVar = c5865x48f502ce.f136173g;
            hpVar.f88390a = str2;
            hpVar.f88391b = b0Var2 != null ? b0Var2.f552044a : "unknow";
            hpVar.f88392c = b0Var3.f552045b;
            hpVar.f88393d = b0Var2 != null ? b0Var2.f552045b : 0L;
            hpVar.f88394e = wi6;
            c5865x48f502ce.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiSessionData", "quit find more friends ui fromSid[%s] toSid[%s]", hpVar.f88390a, hpVar.f88391b);
        }
        if (b0Var2 == null || !"2".equals(b0Var2.f552044a)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5329xe8d33657 c5329xe8d33657 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5329xe8d33657();
        am.v4 v4Var = c5329xe8d33657.f135642g;
        v4Var.getClass();
        v4Var.f89703a = b0Var3 != null ? b0Var3.f552044a : "unknow";
        c5329xe8d33657.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiSessionData", "enter find more friends ui fromSid[%s]", v4Var.f89703a);
    }
}
