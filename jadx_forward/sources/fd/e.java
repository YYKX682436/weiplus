package fd;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3254xffc5bb87 f342777a = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3254xffc5bb87();

    public final void a(org.json.JSONObject config, java.nio.ByteBuffer data, fd.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteAppNetworkService", "request cgi - config size: %d data size: %d", java.lang.Integer.valueOf(config.length()), java.lang.Integer.valueOf(data.capacity()));
            fd.f fVar = new fd.f(config, data);
            fVar.f342786i = new fd.d(fVar, this, callback);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(fVar.f342778a);
            objArr[1] = fVar.f342779b;
            byte[] bArr = fVar.f342785h;
            objArr[2] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPLiteAppNetworkService", "start invoke cgi - cgiId: %d cgiUrl: %s dataSize: %d", objArr);
            this.f342777a.mo25945xb9724478(fVar, null);
        } catch (java.lang.IllegalArgumentException e17) {
            java.lang.String message = e17.getMessage();
            if (message == null) {
                message = e17.toString();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXPLiteAppNetworkService", "invoke argument error, message: %s", message);
            callback.mo25663xc39ed64f(new com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb(-2, message, null));
        } catch (org.json.JSONException e18) {
            java.lang.String message2 = e18.getMessage();
            if (message2 == null) {
                message2 = e18.toString();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXPLiteAppNetworkService", "invoke argument error, message: %s", message2);
            callback.mo25663xc39ed64f(new com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb(-2, message2, null));
        } catch (java.lang.Exception e19) {
            java.lang.String message3 = e19.getMessage();
            if (message3 == null) {
                message3 = e19.toString();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXPLiteAppNetworkService", "invoke system error, message: %s", message3);
            callback.mo25663xc39ed64f(new com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p366x633fb29.C3690x37f511eb(-1, message3, null));
        }
    }
}
