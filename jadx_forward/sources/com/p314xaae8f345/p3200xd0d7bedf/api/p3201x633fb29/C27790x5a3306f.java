package com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29;

/* renamed from: com.tencent.wework.api.model.WWMediaMergedConvs */
/* loaded from: classes9.dex */
public class C27790x5a3306f extends com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f301695f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int f301696g = 0;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f301697h = null;

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void a(android.content.Intent intent, java.lang.String str) {
        java.util.Iterator it = ((java.util.ArrayList) this.f301695f).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6) it.next()).a(intent, str);
        }
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public boolean b() {
        java.util.List list;
        if (!super.b() || (list = this.f301695f) == null || ((java.util.ArrayList) list).size() == 0) {
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            if (!((com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void d(android.content.Context context) {
        this.f301678a = context;
        java.util.Iterator it = ((java.util.ArrayList) this.f301695f).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6) it.next()).d(context);
        }
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void e(java.lang.String str) {
        this.f301679b = str;
        java.util.Iterator it = ((java.util.ArrayList) this.f301695f).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6) it.next()).e(str);
        }
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void f(android.os.Bundle bundle) {
        java.util.List list = this.f301695f;
        bundle.putInt("_wwmergedconvobject_messageslen", ((java.util.ArrayList) list).size());
        for (int i17 = 0; i17 < ((java.util.ArrayList) list).size(); i17++) {
            bundle.putBundle("_wwmergedconvobject_messages" + i17, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6.c((com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6) ((java.util.ArrayList) list).get(i17)));
        }
        bundle.putInt("_wwmergedconvobject_forwardtype", this.f301696g);
        bundle.putByteArray("_wwmergedconvobject_forward_msg_buffer", this.f301697h);
        super.f(bundle);
    }

    public boolean g(com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27785x475b3b87 c27785x475b3b87) {
        if (c27785x475b3b87 == null || !c27785x475b3b87.b()) {
            return false;
        }
        ((java.util.ArrayList) this.f301695f).add(c27785x475b3b87);
        return true;
    }
}
