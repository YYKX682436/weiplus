package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes5.dex */
public class j4 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        java.util.Iterator<android.app.ActivityManager.AppTask> it = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getAppTasks().iterator();
        while (it.hasNext()) {
            it.next().getTaskInfo();
        }
    }
}
