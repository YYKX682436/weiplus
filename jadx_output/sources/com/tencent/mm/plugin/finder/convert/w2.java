package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes9.dex */
public final class w2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f104833d = kotlinx.coroutines.z0.b();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f104834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f104835f;

    public w2(final so2.o0 o0Var, final java.util.ArrayList arrayList, final com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        this.f104835f = wxRecyclerView;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f104834e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UgcEmojiChangedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.convert.FinderEmojiSingleSummaryConvert$onBindViewHolder$2$eventListener$1
            {
                this.__eventId = -664387125;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UgcEmojiChangedEvent ugcEmojiChangedEvent) {
                java.lang.Object obj;
                am.nz nzVar;
                com.tencent.mm.autogen.events.UgcEmojiChangedEvent event = ugcEmojiChangedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.util.Iterator it = so2.o0.this.f410516d.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    obj = null;
                    nzVar = event.f54908g;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String str = ((r45.ri0) next).f384886d;
                    nzVar.getClass();
                    if (kotlin.jvm.internal.o.b(str, null)) {
                        obj = next;
                        break;
                    }
                }
                if (obj == null) {
                    return false;
                }
                nzVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderEmojiSingleSummaryConvert", "UgcEmojiChangedEvent: null");
                kotlinx.coroutines.l.d(this.f104833d, null, null, new com.tencent.mm.plugin.finder.convert.v2(event, arrayList, so2.o0.this, wxRecyclerView, null), 3, null);
                return false;
            }
        };
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        this.f104834e.alive();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlinx.coroutines.z0.e(this.f104833d, null, 1, null);
        this.f104834e.dead();
        this.f104835f.removeOnAttachStateChangeListener(this);
    }
}
