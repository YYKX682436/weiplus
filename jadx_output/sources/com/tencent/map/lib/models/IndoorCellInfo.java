package com.tencent.map.lib.models;

/* loaded from: classes5.dex */
public final class IndoorCellInfo {
    private java.util.List<java.lang.String> areaIds = new java.util.ArrayList();
    private com.tencent.map.lib.models.IndoorCellInfo.Style style;

    /* loaded from: classes5.dex */
    public static class Style {
        private int color;

        public Style(int i17) {
            this.color = i17;
        }

        public int getColor() {
            return this.color;
        }

        public void setColor(int i17) {
            this.color = i17;
        }

        public java.lang.String toString() {
            return "Style{color=" + java.lang.Integer.toHexString(this.color) + '}';
        }
    }

    public IndoorCellInfo(com.tencent.map.lib.models.IndoorCellInfo.Style style) {
        this.style = style;
    }

    public final void addAreaId(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.areaIds.add(str);
    }

    public final java.util.List<java.lang.String> getAreaIds() {
        return this.areaIds;
    }

    public final com.tencent.map.lib.models.IndoorCellInfo.Style getStyle() {
        return this.style;
    }

    public final void setStyle(com.tencent.map.lib.models.IndoorCellInfo.Style style) {
        this.style = style;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IndoorCellInfo{areaIds=");
        sb6.append(this.areaIds);
        sb6.append(", style=");
        com.tencent.map.lib.models.IndoorCellInfo.Style style = this.style;
        sb6.append(style != null ? style.toString() : "null");
        sb6.append('}');
        return sb6.toString();
    }
}
