package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sn {

    /* renamed from: a, reason: collision with root package name */
    public final int f51489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51490b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f51491c = "_night";

    /* renamed from: d, reason: collision with root package name */
    private final java.util.List<com.tencent.mapsdk.internal.st> f51492d;

    public sn(int i17, int i18, java.util.List<com.tencent.mapsdk.internal.st> list) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        this.f51492d = copyOnWriteArrayList;
        this.f51489a = i17;
        this.f51490b = i18;
        copyOnWriteArrayList.addAll(list);
        java.util.Collections.sort(list, new java.util.Comparator<com.tencent.mapsdk.internal.st>() { // from class: com.tencent.mapsdk.internal.sn.1
            private static int a(com.tencent.mapsdk.internal.st stVar, com.tencent.mapsdk.internal.st stVar2) {
                return stVar2.a() - stVar.a();
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(com.tencent.mapsdk.internal.st stVar, com.tencent.mapsdk.internal.st stVar2) {
                return stVar2.a() - stVar.a();
            }
        });
    }

    private int b() {
        return this.f51490b;
    }

    public final java.lang.Object[] a(com.tencent.mapsdk.internal.gb gbVar, boolean z17) {
        java.lang.String str;
        for (com.tencent.mapsdk.internal.st stVar : this.f51492d) {
            if (stVar.a(gbVar)) {
                android.graphics.Bitmap a17 = stVar.a(z17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(stVar.f51537c);
                sb6.append(z17 ? "_night" : "");
                java.lang.String sb7 = sb6.toString();
                if (z17 && (str = stVar.f51539e) != null && str.length() > 0) {
                    return new java.lang.Object[]{sb7, stVar.f51539e, a17};
                }
                return new java.lang.Object[]{sb7, stVar.f51538d, a17};
            }
        }
        return null;
    }

    private int a() {
        return this.f51489a;
    }
}
