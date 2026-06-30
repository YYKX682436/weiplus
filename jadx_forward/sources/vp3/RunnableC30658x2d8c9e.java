package vp3;

/* renamed from: vp3.c$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC30658x2d8c9e implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d> entry : com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d.m100777x49d3c5ef().entrySet()) {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26151xea584e7d value = entry.getValue();
            java.lang.String str = android.text.TextUtils.isEmpty(value.f50250x68ac288) ? value.f50249x683188c : value.f50250x68ac288;
            java.util.List list = (java.util.List) hashMap.get(str);
            if (list == null) {
                list = new java.util.ArrayList();
                hashMap.put(str, list);
            }
            list.add(entry.getKey());
        }
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vp3.c.f520502r, "TP count of stack: %s, id: %s, stack: %s", java.lang.Integer.valueOf(((java.util.List) entry2.getValue()).size()), entry2.getValue(), entry2.getKey());
        }
        if (hashMap.isEmpty()) {
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).wi();
    }
}
