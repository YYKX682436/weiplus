package s65;

/* loaded from: classes11.dex */
public final class a1 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc c20974x100c85cc = com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20974x100c85cc.f273864p;
        if (c20974x100c85cc != null) {
            boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
            java.util.HashMap hashMap = (java.util.HashMap) c20974x100c85cc.f273866i;
            if (hashMap.size() <= 0) {
                return;
            }
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((s65.w) it.next()).g(m40093xb9aa8b5f);
            }
        }
    }
}
