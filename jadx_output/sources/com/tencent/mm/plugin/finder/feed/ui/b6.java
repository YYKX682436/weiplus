package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class b6 implements tj5.x {

    /* renamed from: d, reason: collision with root package name */
    public final so2.e5 f109697d;

    public b6(so2.e5 topic) {
        kotlin.jvm.internal.o.g(topic, "topic");
        this.f109697d = topic;
    }

    @Override // tj5.x
    public java.lang.String R0() {
        java.lang.String string = this.f109697d.f410330d.getString(0);
        if (string == null) {
            string = "";
        }
        return "#".concat(string);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return 0;
    }
}
