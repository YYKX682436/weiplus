package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public interface ud {
    default android.view.View a(android.content.Context context, java.lang.Class cls) {
        return (android.view.View) cls.cast(new d56.b(cls, cls).d(context).f226632b);
    }

    default android.content.Context b(android.content.Context context, java.lang.Class cls) {
        return context;
    }
}
