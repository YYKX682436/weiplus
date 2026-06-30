package ae2;

/* loaded from: classes.dex */
public final class tj implements db5.t4 {
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"liveEntryScene\":");
        sb6.append(menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null);
        sb6.append(",\"liveObjectExportId\":\"\"}");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).Ej("nativeShareToGameLive", "wx95a3a4d7c627e07d", sb6.toString(), true);
    }
}
