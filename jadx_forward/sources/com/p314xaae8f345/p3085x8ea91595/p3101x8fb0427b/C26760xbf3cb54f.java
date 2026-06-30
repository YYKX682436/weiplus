package com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b;

/* renamed from: com.tencent.tmassistantsdk.storage.DBManager */
/* loaded from: classes13.dex */
public class C26760xbf3cb54f {

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f f56736x46143c22;

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f m105397x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f c26760xbf3cb54f;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.class) {
            if (f56736x46143c22 == null) {
                f56736x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f();
            }
            c26760xbf3cb54f = f56736x46143c22;
        }
        return c26760xbf3cb54f;
    }

    /* renamed from: addDownloadInfo */
    public void m105398xbdd60097(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 c26667x4be17176) {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.add(c26667x4be17176);
    }

    /* renamed from: deleteDownloadInfo */
    public void m105399xf72dcea1(java.lang.String str) {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.del(str);
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.m105441x5070d1c3(str);
    }

    /* renamed from: queryDownloadInfoByUrl */
    public com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176 m105400x9e2ff5fa(java.lang.String str) {
        return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.m105448x66f18c8(str);
    }

    /* renamed from: queryDownloadInfoList */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176> m105401xec5873fc() {
        return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.m105447x32c4e6();
    }

    /* renamed from: queryWaitingAndDownloadingTaskList */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26679xba086962> m105402x18c1bab() {
        return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.m105449x66f18c8();
    }

    /* renamed from: saveClientInfo */
    public void m105403xd8e69476(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.m105445x35c17d(str, str2);
    }

    /* renamed from: saveDownloadInfoList */
    public void m105404x1be912b1(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176> arrayList) {
        com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26769x9a8653f8.m105450x35c17d(arrayList);
    }
}
