package vq4;

/* loaded from: classes14.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f520902a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f520903b;

    public o0(int i17) {
        this.f520902a = i17;
    }

    public void a(int i17, int i18, int i19) {
        java.util.Map map;
        if (this.f520903b == null) {
            this.f520903b = new java.util.HashMap();
        }
        if (this.f520903b.containsKey(java.lang.Integer.valueOf(i17))) {
            map = (java.util.Map) this.f520903b.get(java.lang.Integer.valueOf(i17));
        } else {
            map = new java.util.HashMap();
            this.f520903b.put(java.lang.Integer.valueOf(i17), map);
        }
        map.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public boolean b(int i17) {
        java.util.Map map = this.f520903b;
        if (map != null) {
            if (((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(this.f520902a))) {
                if (((java.util.Map) ((java.util.HashMap) this.f520903b).get(java.lang.Integer.valueOf(this.f520902a))).containsKey(java.lang.Integer.valueOf(i17))) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipStateMachine", "state: %s don't contain rule for action: %s", vq4.n0.d(this.f520902a), vq4.n0.d(i17));
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipStateMachine", "no rule for state: %s", vq4.n0.d(this.f520902a));
        return false;
    }
}
