package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "IPCData", "feature-attachment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog */
/* loaded from: classes8.dex */
public final class C19735xf74561d7 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/pluginsdk/ui/tools/q5", "feature-attachment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData */
    /* loaded from: classes8.dex */
    public static final class IPCData implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q5 f38856x681a0c0c = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q5(null);

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f272946d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f272947e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f272948f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f272949g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.Long f272950h;

        /* renamed from: i, reason: collision with root package name */
        public final java.lang.String f272951i;

        public IPCData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l17, java.lang.String str5) {
            this.f272946d = str;
            this.f272947e = str2;
            this.f272948f = str3;
            this.f272949g = str4;
            this.f272950h = l17;
            this.f272951i = str5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
            parcel.writeString(this.f272946d);
            parcel.writeString(this.f272947e);
            parcel.writeString(this.f272948f);
            parcel.writeString(this.f272949g);
            java.lang.Long l17 = this.f272950h;
            parcel.writeLong(l17 != null ? l17.longValue() : 0L);
            parcel.writeString(this.f272951i);
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Long l17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19735xf74561d7.IPCData iPCData = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19735xf74561d7.IPCData) obj;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent className = new android.content.Intent().setClassName(context, "com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "setClassName(...)");
        className.setFlags(268435456);
        java.lang.String str6 = "";
        if (iPCData == null || (str = iPCData.f272947e) == null) {
            str = "";
        }
        className.putExtra("file_path", str);
        if (iPCData == null || (str2 = iPCData.f272948f) == null) {
            str2 = "";
        }
        className.putExtra("file_name", str2);
        if (iPCData == null || (str3 = iPCData.f272949g) == null) {
            str3 = "";
        }
        className.putExtra("file_ext", str3);
        if (iPCData == null || (str4 = iPCData.f272946d) == null) {
            str4 = "";
        }
        className.putExtra("to_user", str4);
        className.putExtra("forward_msgid", (iPCData == null || (l17 = iPCData.f272950h) == null) ? 0L : l17.longValue());
        if (iPCData != null && (str5 = iPCData.f272951i) != null) {
            str6 = str5;
        }
        className.putExtra("forward_msg_talker", str6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog", "invoke", "(Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;Lcom/tencent/mm/ipcinvoker/IPCInvokeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog", "invoke", "(Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;Lcom/tencent/mm/ipcinvoker/IPCInvokeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
